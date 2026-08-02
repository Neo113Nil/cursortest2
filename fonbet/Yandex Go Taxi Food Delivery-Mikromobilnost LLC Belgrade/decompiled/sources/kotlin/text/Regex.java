package kotlin.text;

import defpackage.agc0;
import defpackage.b64;
import defpackage.e2k;
import defpackage.evu0;
import defpackage.npi0;
import defpackage.ny61;
import defpackage.tls;
import defpackage.w610;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0002\u0012\u0013J\u000f\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lkotlin/text/Regex;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "writeReplace", "()Ljava/lang/Object;", "Ljava/io/ObjectInputStream;", "input", "Lzy11;", "readObject", "(Ljava/io/ObjectInputStream;)V", "Ljava/util/regex/Pattern;", "nativePattern", "Ljava/util/regex/Pattern;", "", "Lkotlin/text/RegexOption;", "_options", "Ljava/util/Set;", "Serialized", "npi0", "kotlin-stdlib"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class Regex implements Serializable {
    public static final npi0 a = new npi0();
    private Set<? extends RegexOption> _options;
    private final Pattern nativePattern;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002J\u000f\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lkotlin/text/Regex$Serialized;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "readResolve", "()Ljava/lang/Object;", "", "pattern", "Ljava/lang/String;", "getPattern", "()Ljava/lang/String;", "", "flags", CA20Status.STATUS_USER_I, "getFlags", "()I", "kotlin-stdlib"}, k = 1, mv = {2, 4, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Serialized implements Serializable {
        private static final long serialVersionUID = 0;
        private final int flags;
        private final String pattern;

        public Serialized(String str, int i) {
            this.pattern = str;
            this.flags = i;
        }

        private final Object readResolve() {
            return new Regex(Pattern.compile(this.pattern, this.flags));
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Regex(String str, RegexOption regexOption) {
        this(Pattern.compile(str, (r3 & 2) != 0 ? r3 | 64 : r3));
        int value = regexOption.getValue();
    }

    public static e2k c(Regex regex, CharSequence charSequence) {
        regex.getClass();
        if (charSequence.length() >= 0) {
            return new e2k(1, new agc0(24, regex, charSequence), Regex$findAll$2.b);
        }
        ny61.i(b64.t(0, "Start index out of bounds: ", ", input length: "), charSequence.length());
        return null;
    }

    private final void readObject(ObjectInputStream input) {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() {
        return new Serialized(this.nativePattern.pattern(), this.nativePattern.flags());
    }

    public final boolean a(CharSequence charSequence) {
        return this.nativePattern.matcher(charSequence).find();
    }

    public final w610 b(CharSequence charSequence) {
        Matcher matcher = this.nativePattern.matcher(charSequence);
        if (matcher.find(0)) {
            return new w610(matcher, charSequence);
        }
        return null;
    }

    public final w610 f(int i, String str) {
        Matcher region = this.nativePattern.matcher(str).useAnchoringBounds(false).useTransparentBounds(true).region(i, str.length());
        if (region.lookingAt()) {
            return new w610(region, str);
        }
        return null;
    }

    public final w610 g(String str) {
        Matcher matcher = this.nativePattern.matcher(str);
        if (matcher.matches()) {
            return new w610(matcher, str);
        }
        return null;
    }

    public final boolean h(CharSequence charSequence) {
        return this.nativePattern.matcher(charSequence).matches();
    }

    public final String i(CharSequence charSequence, tls tlsVar) {
        w610 b = b(charSequence);
        if (b == null) {
            return charSequence.toString();
        }
        int length = charSequence.length();
        StringBuilder sb = new StringBuilder(length);
        int i = 0;
        do {
            sb.append(charSequence, i, b.b().a);
            sb.append((CharSequence) tlsVar.invoke(b));
            i = b.b().b + 1;
            b = b.c();
            if (i >= length) {
                break;
            }
        } while (b != null);
        if (i < length) {
            sb.append(charSequence, i, length);
        }
        return sb.toString();
    }

    public final String j(CharSequence charSequence, String str) {
        return this.nativePattern.matcher(charSequence).replaceAll(str);
    }

    public final String k(CharSequence charSequence, String str) {
        return this.nativePattern.matcher(charSequence).replaceFirst(str);
    }

    public final List l(int i, CharSequence charSequence) {
        evu0.V(i);
        Matcher matcher = this.nativePattern.matcher(charSequence);
        if (i == 1 || !matcher.find()) {
            return Collections.singletonList(charSequence.toString());
        }
        int i2 = 10;
        if (i > 0 && i <= 10) {
            i2 = i;
        }
        ArrayList arrayList = new ArrayList(i2);
        int i3 = i - 1;
        int i4 = 0;
        do {
            arrayList.add(charSequence.subSequence(i4, matcher.start()).toString());
            i4 = matcher.end();
            if (i3 >= 0 && arrayList.size() == i3) {
                break;
            }
        } while (matcher.find());
        arrayList.add(charSequence.subSequence(i4, charSequence.length()).toString());
        return arrayList;
    }

    /* renamed from: m, reason: from getter */
    public final Pattern getNativePattern() {
        return this.nativePattern;
    }

    public final String toString() {
        return this.nativePattern.toString();
    }

    public Regex(String str) {
        this(Pattern.compile(str));
    }

    public Regex(Pattern pattern) {
        this.nativePattern = pattern;
    }
}
