package defpackage;

import com.yandex.go.zone.dto.objects.CancelReasonsGrouped;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class sy7 implements wy7 {
    public final String a;
    public final CancelReasonsGrouped.Comment.CommentModal b;

    public sy7(CancelReasonsGrouped.Comment.CommentModal commentModal, String str) {
        this.a = str;
        this.b = commentModal;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sy7)) {
            return false;
        }
        sy7 sy7Var = (sy7) obj;
        return jl40.l(this.a, sy7Var.a) && jl40.l(this.b, sy7Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return "CommentClicked(currentComment=" + this.a + ", commentModalDto=" + this.b + Extension.C_BRAKE;
    }
}
