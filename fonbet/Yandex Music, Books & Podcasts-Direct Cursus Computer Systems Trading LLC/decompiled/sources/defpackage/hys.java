package defpackage;

import com.connectsdk.service.command.ServiceCommand;
import java.util.Date;

/* loaded from: classes5.dex */
public final class hys implements l9b {
    public final long a;
    public final int b;
    public final rr5 c;
    public final int d;
    public final Date e;

    public hys(long j, int i, int i2, String str, String str2, Date date) {
        this.b = i;
        this.a = j;
        this.c = q6k.A(str, str2);
        this.d = i2;
        this.e = date;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TrackOperation{mId='null', mPlaylistId=");
        sb.append(this.a);
        sb.append(", mType=");
        int i = this.b;
        sb.append(i != 1 ? i != 2 ? "null" : ServiceCommand.TYPE_DEL : "INSERT");
        sb.append(", mTrackId=");
        rr5 rr5Var = this.c;
        sb.append(rr5Var.a);
        sb.append(", mAlbumId=");
        sb.append(rr5Var.b);
        sb.append(", mPosition=");
        sb.append(this.d);
        sb.append(", mTimestamp=");
        sb.append(this.e);
        sb.append('}');
        return sb.toString();
    }
}
