package defpackage;

import java.util.LinkedHashMap;

/* loaded from: classes3.dex */
public final class pwl {
    public final fnb a;
    public final nmb b;

    public pwl(fnb fnbVar, int i) {
        switch (i) {
            case 1:
                this.a = fnbVar;
                this.b = qld.m();
                break;
            default:
                this.a = fnbVar;
                this.b = qld.m();
                break;
        }
    }

    public static imb b(dh dhVar) {
        int ordinal = dhVar.ordinal();
        if (ordinal == 0) {
            return imb.Share;
        }
        if (ordinal == 2) {
            return imb.Like;
        }
        if (ordinal == 16) {
            return imb.Unlike;
        }
        if (ordinal == 18) {
            return imb.DeleteFromDevice;
        }
        if (ordinal == 19) {
            return imb.Upload;
        }
        switch (ordinal) {
            case 7:
                return imb.PlayNext;
            case 8:
                return imb.AddToQueue;
            case 9:
                return imb.AddToPlaylist;
            case 10:
                return imb.GoToAlbum;
            case 11:
                return imb.GoToArtist;
            case 12:
                return imb.Text;
            default:
                return null;
        }
    }

    public void a(String str, wjb wjbVar) {
        str.getClass();
        String G = this.a.G();
        nmb nmbVar = this.b;
        nmbVar.getClass();
        G.getClass();
        LinkedHashMap m = dfi.m("page_type", "listing", "hash", G);
        m.put("view_uuid", str);
        m.put("page_id", "playlist_list_screen");
        m.put("to", wjbVar.a);
        dfi.p(1, "from", "playlist_list_screen", "_meta", m);
        nmbVar.C("PlaylistList.Navigated", m);
    }
}
