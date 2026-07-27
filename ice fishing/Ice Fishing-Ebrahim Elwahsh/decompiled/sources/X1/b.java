package X1;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Spanned;
import com.google.android.gms.internal.ads.AbstractC2998bk;
import com.google.android.gms.internal.ads.C2522Dj;
import com.google.android.gms.internal.ads.C2710Ok;
import com.google.android.gms.internal.ads.C2846Wk;
import com.google.android.gms.internal.ads.C3430jk;
import com.google.android.gms.internal.ads.C3558m3;
import com.google.android.gms.internal.ads.C3827r3;
import com.google.android.gms.internal.ads.C3969tk;
import com.google.android.gms.internal.ads.InterfaceC3273gn;
import com.google.android.gms.internal.ads.InterfaceC3448k1;
import com.google.android.gms.internal.ads.InterfaceC3865ro;
import com.google.android.gms.internal.ads.KO;
import com.google.android.gms.internal.ads.LO;
import com.google.android.gms.internal.ads.Lr;
import com.google.android.gms.internal.ads.PA;
import com.google.android.gms.internal.ads.SB;
import com.google.android.gms.internal.ads.UB;
import java.io.ByteArrayOutputStream;
import java.net.URL;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class b implements InterfaceC3273gn, InterfaceC3865ro {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f3816n = 3;

    /* renamed from: u, reason: collision with root package name */
    public long f3817u;

    /* renamed from: v, reason: collision with root package name */
    public int f3818v;

    /* renamed from: w, reason: collision with root package name */
    public Object f3819w;

    public /* synthetic */ b() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.InterfaceC3273gn, com.google.android.gms.internal.ads.InterfaceC3865ro
    /* renamed from: b */
    public void mo2b(Object obj) {
        int i;
        switch (this.f3816n) {
            case 1:
                C3558m3 c3558m3 = (C3558m3) obj;
                C3827r3 c3827r3 = (C3827r3) this.f3819w;
                c3827r3.f33946h.getClass();
                UB ub = c3558m3.f32653a;
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>(ub.size());
                int i4 = 0;
                SB listIterator = ub.listIterator(0);
                while (listIterator.hasNext()) {
                    C2522Dj c2522Dj = (C2522Dj) listIterator.next();
                    c2522Dj.getClass();
                    Bundle bundle = new Bundle();
                    CharSequence charSequence = c2522Dj.f24531a;
                    if (charSequence != null) {
                        bundle.putCharSequence(C2522Dj.f24521q, charSequence);
                        if (charSequence instanceof Spanned) {
                            Spanned spanned = (Spanned) charSequence;
                            String str = AbstractC2998bk.f29559a;
                            ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>();
                            C3969tk[] c3969tkArr = (C3969tk[]) spanned.getSpans(i4, spanned.length(), C3969tk.class);
                            int length = c3969tkArr.length;
                            for (int i9 = i4; i9 < length; i9++) {
                                C3969tk c3969tk = c3969tkArr[i9];
                                c3969tk.getClass();
                                Bundle bundle2 = new Bundle();
                                bundle2.putString(C3969tk.f34449c, c3969tk.f34451a);
                                bundle2.putInt(C3969tk.f34450d, c3969tk.f34452b);
                                arrayList2.add(AbstractC2998bk.a(spanned, c3969tk, 1, bundle2));
                            }
                            for (C2710Ok c2710Ok : (C2710Ok[]) spanned.getSpans(0, spanned.length(), C2710Ok.class)) {
                                c2710Ok.getClass();
                                Bundle bundle3 = new Bundle();
                                bundle3.putInt(C2710Ok.f26748d, c2710Ok.f26751a);
                                bundle3.putInt(C2710Ok.f26749e, c2710Ok.f26752b);
                                bundle3.putInt(C2710Ok.f26750f, c2710Ok.f26753c);
                                arrayList2.add(AbstractC2998bk.a(spanned, c2710Ok, 2, bundle3));
                            }
                            for (C3430jk c3430jk : (C3430jk[]) spanned.getSpans(0, spanned.length(), C3430jk.class)) {
                                arrayList2.add(AbstractC2998bk.a(spanned, c3430jk, 3, null));
                            }
                            for (C2846Wk c2846Wk : (C2846Wk[]) spanned.getSpans(0, spanned.length(), C2846Wk.class)) {
                                c2846Wk.getClass();
                                Bundle bundle4 = new Bundle();
                                bundle4.putString(C2846Wk.f28452b, c2846Wk.f28453a);
                                arrayList2.add(AbstractC2998bk.a(spanned, c2846Wk, 4, bundle4));
                            }
                            if (!arrayList2.isEmpty()) {
                                bundle.putParcelableArrayList(C2522Dj.f24522r, arrayList2);
                            }
                        }
                    }
                    bundle.putSerializable(C2522Dj.f24523s, c2522Dj.f24532b);
                    bundle.putSerializable(C2522Dj.f24524t, c2522Dj.f24533c);
                    bundle.putFloat(C2522Dj.f24526v, c2522Dj.f24535e);
                    bundle.putInt(C2522Dj.f24527w, c2522Dj.f24536f);
                    bundle.putInt(C2522Dj.f24528x, c2522Dj.f24537g);
                    bundle.putFloat(C2522Dj.f24529y, c2522Dj.f24538h);
                    bundle.putInt(C2522Dj.f24530z, c2522Dj.i);
                    bundle.putInt(C2522Dj.f24512A, c2522Dj.f24541l);
                    bundle.putFloat(C2522Dj.f24513B, c2522Dj.f24542m);
                    bundle.putFloat(C2522Dj.f24514C, c2522Dj.f24539j);
                    bundle.putFloat(C2522Dj.f24515D, c2522Dj.f24540k);
                    bundle.putBoolean(C2522Dj.f24517F, false);
                    bundle.putInt(C2522Dj.f24516E, -16777216);
                    bundle.putInt(C2522Dj.f24518G, c2522Dj.f24543n);
                    bundle.putFloat(C2522Dj.f24519H, c2522Dj.f24544o);
                    bundle.putInt(C2522Dj.f24520I, c2522Dj.f24545p);
                    Bitmap bitmap = c2522Dj.f24534d;
                    if (bitmap != null) {
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        i = 0;
                        PA.T(bitmap.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream));
                        bundle.putByteArray(C2522Dj.f24525u, byteArrayOutputStream.toByteArray());
                    } else {
                        i = 0;
                    }
                    arrayList.add(bundle);
                    i4 = i;
                }
                boolean z8 = i4;
                Bundle bundle5 = new Bundle();
                bundle5.putParcelableArrayList("c", arrayList);
                bundle5.putLong("d", c3558m3.f32655c);
                Parcel obtain = Parcel.obtain();
                obtain.writeBundle(bundle5);
                byte[] marshall = obtain.marshall();
                obtain.recycle();
                int length2 = marshall.length;
                Lr lr = c3827r3.f33941c;
                lr.z(length2, marshall);
                InterfaceC3448k1 interfaceC3448k1 = c3827r3.f33939a;
                interfaceC3448k1.a(length2, lr);
                long j9 = c3558m3.f32654b;
                long j10 = this.f3817u;
                if (j9 == com.anythink.basead.exoplayer.b.f6539b) {
                    if (c3827r3.f33946h.f27781t == Long.MAX_VALUE) {
                        z8 = 1;
                    }
                    PA.T(z8);
                } else {
                    long j11 = c3827r3.f33946h.f27781t;
                    j10 = j11 == Long.MAX_VALUE ? j10 + j9 : j9 + j11;
                }
                interfaceC3448k1.b(j10, this.f3818v | 1, length2, 0, null);
                break;
            default:
                ((LO) obj).m((KO) this.f3819w, this.f3818v, this.f3817u);
                break;
        }
    }

    public /* synthetic */ b(C3827r3 c3827r3, long j9, int i) {
        this.f3819w = c3827r3;
        this.f3817u = j9;
        this.f3818v = i;
    }

    public /* synthetic */ b(KO ko, int i, long j9, long j10) {
        this.f3819w = ko;
        this.f3818v = i;
        this.f3817u = j9;
    }

    public b(int i, URL url, long j9) {
        this.f3818v = i;
        this.f3819w = url;
        this.f3817u = j9;
    }
}
