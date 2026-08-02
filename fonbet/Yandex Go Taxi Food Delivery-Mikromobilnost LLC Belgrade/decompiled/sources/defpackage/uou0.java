package defpackage;

import com.ybsdk.core.stories.entities.StoryItemEntity$FullScreenItemEntity$VideoSettings$RepeatMode;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class uou0 {
    public final fxy0 a;
    public final StoryItemEntity$FullScreenItemEntity$VideoSettings$RepeatMode b;

    public uou0(fxy0 fxy0Var, StoryItemEntity$FullScreenItemEntity$VideoSettings$RepeatMode storyItemEntity$FullScreenItemEntity$VideoSettings$RepeatMode) {
        this.a = fxy0Var;
        this.b = storyItemEntity$FullScreenItemEntity$VideoSettings$RepeatMode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uou0)) {
            return false;
        }
        uou0 uou0Var = (uou0) obj;
        return jl40.l(this.a, uou0Var.a) && this.b == uou0Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "VideoSettings(uri=" + this.a + ", repeatMode=" + this.b + Extension.C_BRAKE;
    }
}
