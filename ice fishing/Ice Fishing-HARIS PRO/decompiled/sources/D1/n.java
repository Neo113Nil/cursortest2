package D1;

import java.io.Serializable;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class n implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f169a;

    /* renamed from: b, reason: collision with root package name */
    public Object f170b;

    public n(int i) {
        this.f169a = i;
        switch (i) {
            case 1:
                Pattern compile = Pattern.compile("[\\x00-\\x20]*[+-]?(NaN|Infinity|((((\\p{Digit}+)(\\.)?((\\p{Digit}+)?)([eE][+-]?(\\p{Digit}+))?)|(\\.((\\p{Digit}+))([eE][+-]?(\\p{Digit}+))?)|(((0[xX](\\p{XDigit}+)(\\.)?)|(0[xX](\\p{XDigit}+)?(\\.)(\\p{XDigit}+)))[pP][+-]?(\\p{Digit}+)))[fFdD]?))[\\x00-\\x20]*");
                i.d(compile, "compile(...)");
                this.f170b = compile;
                break;
        }
    }

    public final String toString() {
        switch (this.f169a) {
            case 0:
                return String.valueOf(this.f170b);
            default:
                String pattern = ((Pattern) this.f170b).toString();
                i.d(pattern, "toString(...)");
                return pattern;
        }
    }
}
