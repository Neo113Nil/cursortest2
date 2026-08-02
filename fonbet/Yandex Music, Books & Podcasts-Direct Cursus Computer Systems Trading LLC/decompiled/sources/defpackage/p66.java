package defpackage;

import android.app.PendingIntent;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class p66 {
    public static final String A;
    public static final String B;
    public static final String C;
    public static final String o;
    public static final String p;
    public static final String q;
    public static final String r;
    public static final String s;
    public static final String t;
    public static final String u;
    public static final String v;
    public static final String w;
    public static final String x;
    public static final String y;
    public static final String z;
    public final int a;
    public final int b;
    public final c9e c;
    public final PendingIntent d;
    public final blp e;
    public final d8l f;
    public final d8l g;
    public final Bundle h;
    public final Bundle i;
    public final rdl j;
    public final yde k;
    public final yde l;
    public final MediaSession.Token m;
    public final yde n;

    static {
        int i = dvt.a;
        o = Integer.toString(0, 36);
        p = Integer.toString(1, 36);
        q = Integer.toString(2, 36);
        r = Integer.toString(9, 36);
        s = Integer.toString(14, 36);
        t = Integer.toString(13, 36);
        u = Integer.toString(3, 36);
        v = Integer.toString(4, 36);
        w = Integer.toString(5, 36);
        x = Integer.toString(6, 36);
        y = Integer.toString(11, 36);
        z = Integer.toString(7, 36);
        A = Integer.toString(8, 36);
        B = Integer.toString(10, 36);
        C = Integer.toString(12, 36);
    }

    public p66(int i, int i2, c9e c9eVar, PendingIntent pendingIntent, yde ydeVar, yde ydeVar2, yde ydeVar3, blp blpVar, d8l d8lVar, d8l d8lVar2, Bundle bundle, Bundle bundle2, rdl rdlVar, MediaSession.Token token) {
        this.a = i;
        this.b = i2;
        this.c = c9eVar;
        this.d = pendingIntent;
        this.k = ydeVar;
        this.l = ydeVar2;
        this.n = ydeVar3;
        this.e = blpVar;
        this.f = d8lVar;
        this.g = d8lVar2;
        this.h = bundle;
        this.i = bundle2;
        this.j = rdlVar;
        this.m = token;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v10, types: [c9e] */
    public static p66 a(Bundle bundle) {
        qsn qsnVar;
        qsn qsnVar2;
        qsn qsnVar3;
        z8e z8eVar;
        IBinder binder = bundle.getBinder(B);
        if (binder instanceof o66) {
            return ((o66) binder).a;
        }
        int i = bundle.getInt(o, 0);
        int i2 = bundle.getInt(A, 0);
        IBinder binder2 = bundle.getBinder(p);
        binder2.getClass();
        IBinder iBinder = binder2;
        PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable(q);
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(r);
        if (parcelableArrayList != null) {
            tde u2 = yde.u();
            for (int i3 = 0; i3 < parcelableArrayList.size(); i3++) {
                Bundle bundle2 = (Bundle) parcelableArrayList.get(i3);
                bundle2.getClass();
                u2.a(tb5.d(i2, bundle2));
            }
            qsnVar = u2.f();
        } else {
            ude udeVar = yde.b;
            qsnVar = qsn.e;
        }
        qsn qsnVar4 = qsnVar;
        ArrayList parcelableArrayList2 = bundle.getParcelableArrayList(s);
        if (parcelableArrayList2 != null) {
            tde u3 = yde.u();
            for (int i4 = 0; i4 < parcelableArrayList2.size(); i4++) {
                Bundle bundle3 = (Bundle) parcelableArrayList2.get(i4);
                bundle3.getClass();
                u3.a(tb5.d(i2, bundle3));
            }
            qsnVar2 = u3.f();
        } else {
            ude udeVar2 = yde.b;
            qsnVar2 = qsn.e;
        }
        qsn qsnVar5 = qsnVar2;
        ArrayList parcelableArrayList3 = bundle.getParcelableArrayList(t);
        if (parcelableArrayList3 != null) {
            tde u4 = yde.u();
            for (int i5 = 0; i5 < parcelableArrayList3.size(); i5++) {
                Bundle bundle4 = (Bundle) parcelableArrayList3.get(i5);
                bundle4.getClass();
                u4.a(tb5.d(i2, bundle4));
            }
            qsnVar3 = u4.f();
        } else {
            ude udeVar3 = yde.b;
            qsnVar3 = qsn.e;
        }
        qsn qsnVar6 = qsnVar3;
        Bundle bundle5 = bundle.getBundle(u);
        blp a = bundle5 == null ? blp.b : blp.a(bundle5);
        Bundle bundle6 = bundle.getBundle(w);
        d8l b = bundle6 == null ? d8l.b : d8l.b(bundle6);
        Bundle bundle7 = bundle.getBundle(v);
        d8l b2 = bundle7 == null ? d8l.b : d8l.b(bundle7);
        Bundle bundle8 = bundle.getBundle(x);
        Bundle bundle9 = bundle.getBundle(y);
        Bundle bundle10 = bundle.getBundle(z);
        rdl r2 = bundle10 == null ? rdl.F : rdl.r(i2, bundle10);
        MediaSession.Token token = (MediaSession.Token) bundle.getParcelable(C);
        Bundle bundle11 = bundle9;
        int i6 = gvh.m;
        IInterface queryLocalInterface = iBinder.queryLocalInterface("androidx.media3.session.IMediaSession");
        if (queryLocalInterface == null || !(queryLocalInterface instanceof c9e)) {
            z8e z8eVar2 = new z8e();
            z8eVar2.a = iBinder;
            z8eVar = z8eVar2;
        } else {
            z8eVar = (c9e) queryLocalInterface;
        }
        if (bundle8 == null) {
            bundle8 = Bundle.EMPTY;
        }
        Bundle bundle12 = bundle8;
        if (bundle11 == null) {
            bundle11 = Bundle.EMPTY;
        }
        return new p66(i, i2, z8eVar, pendingIntent, qsnVar4, qsnVar5, qsnVar6, a, b2, b, bundle12, bundle11, r2, token);
    }

    public final Bundle b(int i) {
        Bundle bundle = new Bundle();
        bundle.putInt(o, this.a);
        bundle.putBinder(p, this.c.asBinder());
        bundle.putParcelable(q, this.d);
        yde ydeVar = this.k;
        boolean isEmpty = ydeVar.isEmpty();
        String str = r;
        if (!isEmpty) {
            ArrayList<? extends Parcelable> arrayList = new ArrayList<>(ydeVar.size());
            Iterator<E> it = ydeVar.iterator();
            while (it.hasNext()) {
                arrayList.add(((tb5) it.next()).g());
            }
            bundle.putParcelableArrayList(str, arrayList);
        }
        yde ydeVar2 = this.l;
        if (!ydeVar2.isEmpty()) {
            if (i >= 7) {
                ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>(ydeVar2.size());
                Iterator<E> it2 = ydeVar2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((tb5) it2.next()).g());
                }
                bundle.putParcelableArrayList(s, arrayList2);
            } else {
                qsn e = tb5.e(ydeVar2, true, true);
                ArrayList<? extends Parcelable> arrayList3 = new ArrayList<>(e.d);
                ude listIterator = e.listIterator(0);
                while (listIterator.hasNext()) {
                    arrayList3.add(((tb5) listIterator.next()).g());
                }
                bundle.putParcelableArrayList(str, arrayList3);
            }
        }
        yde ydeVar3 = this.n;
        if (!ydeVar3.isEmpty()) {
            ArrayList<? extends Parcelable> arrayList4 = new ArrayList<>(ydeVar3.size());
            Iterator<E> it3 = ydeVar3.iterator();
            while (it3.hasNext()) {
                arrayList4.add(((tb5) it3.next()).g());
            }
            bundle.putParcelableArrayList(t, arrayList4);
        }
        bundle.putBundle(u, this.e.b());
        String str2 = v;
        d8l d8lVar = this.f;
        bundle.putBundle(str2, d8lVar.c());
        String str3 = w;
        d8l d8lVar2 = this.g;
        bundle.putBundle(str3, d8lVar2.c());
        bundle.putBundle(x, this.h);
        bundle.putBundle(y, this.i);
        bundle.putBundle(z, this.j.q(vwh.d(d8lVar, d8lVar2), false, false).t(i));
        bundle.putInt(A, this.b);
        MediaSession.Token token = this.m;
        if (token != null) {
            bundle.putParcelable(C, token);
        }
        return bundle;
    }
}
