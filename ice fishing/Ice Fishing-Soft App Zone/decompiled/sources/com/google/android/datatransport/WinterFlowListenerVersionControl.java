package com.google.android.datatransport;

import java.io.Serializable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowListenerVersionControl implements Serializable {
    public final Pattern WinterFlowVariableVersionControl;

    public WinterFlowListenerVersionControl(String str, int i) {
        str.getClass();
        Pattern compile = Pattern.compile(str, 66);
        compile.getClass();
        this.WinterFlowVariableVersionControl = compile;
    }

    public final WinterFlowStackProvider WinterFlowRouterStructure(String str) {
        str.getClass();
        Matcher matcher = this.WinterFlowVariableVersionControl.matcher(str);
        matcher.getClass();
        if (matcher.matches()) {
            return new WinterFlowStackProvider(matcher, str);
        }
        return null;
    }

    public final String toString() {
        String pattern = this.WinterFlowVariableVersionControl.toString();
        pattern.getClass();
        return pattern;
    }

    public WinterFlowListenerVersionControl(String str) {
        str.getClass();
        Pattern compile = Pattern.compile(str);
        compile.getClass();
        this.WinterFlowVariableVersionControl = compile;
    }
}
