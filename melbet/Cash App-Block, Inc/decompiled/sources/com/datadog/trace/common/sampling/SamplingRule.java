package com.datadog.trace.common.sampling;

import com.datadog.trace.core.DDSpan;
import com.datadog.trace.core.util.GlobPattern;
import com.datadog.trace.core.util.Matchers;
import com.fillr.n;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;

/* loaded from: classes4.dex */
public abstract class SamplingRule {
    public final DeterministicSampler$TraceSampler sampler;

    public final class AlwaysMatchesSamplingRule extends SamplingRule {
        @Override // com.datadog.trace.common.sampling.SamplingRule
        public final boolean matches(DDSpan dDSpan) {
            return true;
        }
    }

    public final class ServiceSamplingRule extends SamplingRule {
        public final /* synthetic */ int $r8$classId;
        public final Pattern pattern;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ServiceSamplingRule(String str, DeterministicSampler$TraceSampler deterministicSampler$TraceSampler, int i) {
            super(deterministicSampler$TraceSampler);
            this.$r8$classId = i;
            this.pattern = Pattern.compile(str);
        }

        @Override // com.datadog.trace.common.sampling.SamplingRule
        public final boolean matches(DDSpan dDSpan) {
            CharSequence charSequence;
            switch (this.$r8$classId) {
                case 0:
                    charSequence = dDSpan.context.serviceName;
                    break;
                default:
                    charSequence = dDSpan.context.operationName;
                    break;
            }
            return charSequence != null && this.pattern.matcher(charSequence).matches();
        }
    }

    public final class TraceSamplingRule extends SamplingRule {
        public final Matchers.ExactMatcher operationMatcher;
        public final Matchers.ExactMatcher resourceMatcher;
        public final Matchers.ExactMatcher serviceMatcher;
        public final n.b tagsMatcher;

        public TraceSamplingRule(String str, String str2, String str3, Map map, DeterministicSampler$TraceSampler deterministicSampler$TraceSampler) {
            super(deterministicSampler$TraceSampler);
            this.serviceMatcher = Matchers.compileGlob(str);
            this.operationMatcher = Matchers.compileGlob(str2);
            this.resourceMatcher = Matchers.compileGlob(str3);
            Set<Map.Entry> entrySet = map.entrySet();
            HashMap hashMap = new HashMap();
            for (Map.Entry entry : entrySet) {
                String str4 = (String) entry.getKey();
                String str5 = (String) entry.getValue();
                if (str5.indexOf(42) == -1 && str5.indexOf(63) == -1) {
                    hashMap.put(str4, new Matchers.ExactMatcher(0, str5));
                } else {
                    hashMap.put(str4, new Matchers.ExactMatcher(1, GlobPattern.globToRegexPattern(str5)));
                }
            }
            this.tagsMatcher = new n.b(hashMap, 13);
        }

        @Override // com.datadog.trace.common.sampling.SamplingRule
        public final boolean matches(DDSpan dDSpan) {
            Matchers.ExactMatcher exactMatcher = this.serviceMatcher;
            String str = dDSpan.context.serviceName;
            if (exactMatcher != null && !exactMatcher.matches(str)) {
                return false;
            }
            Matchers.ExactMatcher exactMatcher2 = this.operationMatcher;
            CharSequence charSequence = dDSpan.context.operationName;
            if (exactMatcher2 != null && !exactMatcher2.matches(charSequence)) {
                return false;
            }
            Matchers.ExactMatcher exactMatcher3 = this.resourceMatcher;
            CharSequence resourceName = dDSpan.context.getResourceName();
            if (exactMatcher3 != null && !exactMatcher3.matches(resourceName)) {
                return false;
            }
            n.b bVar = this.tagsMatcher;
            bVar.getClass();
            Iterator it = new HashSet(((HashMap) bVar.b).entrySet()).iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                Object tag = dDSpan.getTag(String.valueOf((CharSequence) entry.getKey()));
                if (tag == null) {
                    tag = null;
                }
                String str2 = (String) tag;
                if (str2 == null || !((Matchers.ExactMatcher) entry.getValue()).matches(str2)) {
                    return false;
                }
            }
            return true;
        }
    }

    public SamplingRule(DeterministicSampler$TraceSampler deterministicSampler$TraceSampler) {
        this.sampler = deterministicSampler$TraceSampler;
    }

    public abstract boolean matches(DDSpan dDSpan);
}
