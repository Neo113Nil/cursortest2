package f6;

import com.google.android.gms.internal.ads.Wv;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/* loaded from: classes2.dex */
public final class f implements g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37487a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f37488b;

    public /* synthetic */ f(int i, Object obj) {
        this.f37487a = i;
        this.f37488b = obj;
    }

    @Override // f6.g
    public final String a() {
        switch (this.f37487a) {
            case 0:
                return (String) ((List) this.f37488b).stream().map(new K6.b(20)).collect(Collectors.joining(", ", "[", "]"));
            case 1:
                return (String) ((List) this.f37488b).stream().map(new K6.b(21)).collect(Collectors.joining(", ", "[", "]"));
            default:
                return (String) this.f37488b;
        }
    }

    public final boolean equals(Object obj) {
        switch (this.f37487a) {
            case 0:
                if (this != obj) {
                    if (obj instanceof g) {
                        if (Objects.equals((List) this.f37488b, ((g) obj).getValue())) {
                        }
                    }
                }
                break;
            case 1:
                if (this != obj) {
                    if (obj instanceof g) {
                        if (Objects.equals((List) this.f37488b, ((g) obj).getValue())) {
                        }
                    }
                }
                break;
            default:
                if (this != obj) {
                    if (obj instanceof g) {
                        if (Objects.equals((String) this.f37488b, ((g) obj).getValue())) {
                        }
                    }
                }
                break;
        }
        return true;
    }

    @Override // f6.g
    public final int getType() {
        switch (this.f37487a) {
            case 0:
                return 6;
            case 1:
                return 5;
            default:
                return 1;
        }
    }

    @Override // f6.g
    public final Object getValue() {
        switch (this.f37487a) {
            case 0:
                return (List) this.f37488b;
            case 1:
                return (List) this.f37488b;
            default:
                return (String) this.f37488b;
        }
    }

    public final int hashCode() {
        switch (this.f37487a) {
            case 0:
                return ((List) this.f37488b).hashCode();
            case 1:
                return ((List) this.f37488b).hashCode();
            default:
                return ((String) this.f37488b).hashCode();
        }
    }

    public final String toString() {
        switch (this.f37487a) {
            case 0:
                return "KeyValueList{" + a() + "}";
            case 1:
                return "ValueArray{" + a() + "}";
            default:
                return Wv.i(new StringBuilder("ValueString{"), (String) this.f37488b, "}");
        }
    }
}
