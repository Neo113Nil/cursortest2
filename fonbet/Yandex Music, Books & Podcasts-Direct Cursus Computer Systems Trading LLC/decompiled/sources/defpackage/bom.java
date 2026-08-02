package defpackage;

import kotlin.jvm.internal.Intrinsics;
import ru.yandex.video.m3.data.dto.VideoData;

/* loaded from: classes6.dex */
public final class bom {
    public final int a;
    public final VideoData b;
    public final dnm c;
    public final jnm d;

    public bom(int i, VideoData videoData, dnm dnmVar, jnm jnmVar) {
        if (i == 0) {
            throw null;
        }
        videoData.getClass();
        this.a = i;
        this.b = videoData;
        this.c = dnmVar;
        this.d = jnmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bom)) {
            return false;
        }
        bom bomVar = (bom) obj;
        return this.a == bomVar.a && Intrinsics.d(this.b, bomVar.b) && Intrinsics.d(this.c, bomVar.c) && Intrinsics.d(this.d, bomVar.d);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (ouj.D(this.a) * 31)) * 31;
        dnm dnmVar = this.c;
        int hashCode2 = (hashCode + (dnmVar == null ? 0 : dnmVar.hashCode())) * 31;
        jnm jnmVar = this.d;
        return hashCode2 + (jnmVar != null ? jnmVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TransactionInfo(transactionType=");
        int i = this.a;
        sb.append(i != 1 ? i != 2 ? i != 3 ? "null" : "CANCEL_PRELOAD" : "SET_PRIORITY" : "START_PRELOAD");
        sb.append(", videoData=");
        sb.append(this.b);
        sb.append(", config=");
        sb.append(this.c);
        sb.append(", priority=");
        sb.append(this.d);
        sb.append(')');
        return sb.toString();
    }
}
