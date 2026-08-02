package defpackage;

import com.ybsdk.widgets.common.YbButtonView;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class tqj0 implements sqj0 {
    public final YbButtonView.a a;

    public tqj0(YbButtonView.a aVar) {
        this.a = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tqj0) && this.a.equals(((tqj0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "RequisiteButtonItem(state=" + this.a + Extension.C_BRAKE;
    }
}
