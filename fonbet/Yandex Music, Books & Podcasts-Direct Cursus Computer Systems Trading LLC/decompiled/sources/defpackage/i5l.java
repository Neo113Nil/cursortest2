package defpackage;

import android.os.Parcel;
import ru.yandex.music.data.audio.Album$AlbumType;

/* loaded from: classes3.dex */
public final class i5l implements wtm, pun {
    public static boolean a() {
        b9s[] b9sVarArr = d9s.a;
        return !d9s.b.contains(c9s.a);
    }

    public static l5t b(Album$AlbumType album$AlbumType) {
        album$AlbumType.getClass();
        return album$AlbumType == Album$AlbumType.SINGLE ? l5t.c : l5t.b;
    }

    @Override // defpackage.pun
    public void accept(Object obj, Object obj2) {
        xbx xbxVar = (xbx) ((tnx) obj).s();
        m9x m9xVar = new m9x(2, (i8s) obj2);
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService");
        int i = x4x.a;
        obtain.writeStrongBinder(m9xVar);
        Parcel obtain2 = Parcel.obtain();
        try {
            xbxVar.a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain.recycle();
            obtain2.recycle();
        }
    }

    @Override // defpackage.wtm
    public void e() {
    }

    @Override // defpackage.wtm
    public void g(int i, Object obj) {
    }
}
