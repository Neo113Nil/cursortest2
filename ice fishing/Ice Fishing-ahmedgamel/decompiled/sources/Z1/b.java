package Z1;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Spanned;
import com.google.android.gms.internal.ads.AbstractC2792Sd;
import com.google.android.gms.internal.ads.AbstractC3012bk;
import com.google.android.gms.internal.ads.C2629Ik;
import com.google.android.gms.internal.ads.C2765Qk;
import com.google.android.gms.internal.ads.C3172ek;
import com.google.android.gms.internal.ads.C3676o3;
import com.google.android.gms.internal.ads.C3764pk;
import com.google.android.gms.internal.ads.C3999u3;
import com.google.android.gms.internal.ads.C4182xO;
import com.google.android.gms.internal.ads.C4302zj;
import com.google.android.gms.internal.ads.Cr;
import com.google.android.gms.internal.ads.InterfaceC3068cn;
import com.google.android.gms.internal.ads.InterfaceC3566m1;
import com.google.android.gms.internal.ads.InterfaceC3606mo;
import com.google.android.gms.internal.ads.InterfaceC4236yO;
import com.google.android.gms.internal.ads.PB;
import com.google.android.gms.internal.ads.RB;
import java.io.ByteArrayOutputStream;
import java.net.URL;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class b implements InterfaceC3068cn, InterfaceC3606mo {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f4111n = 3;

    /* renamed from: u, reason: collision with root package name */
    public long f4112u;

    /* renamed from: v, reason: collision with root package name */
    public int f4113v;

    /* renamed from: w, reason: collision with root package name */
    public Object f4114w;

    public /* synthetic */ b() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.InterfaceC3068cn
    /* renamed from: a */
    public void mo9a(Object obj) {
        int i;
        switch (this.f4111n) {
            case 1:
                C3676o3 c3676o3 = (C3676o3) obj;
                C3999u3 c3999u3 = (C3999u3) this.f4114w;
                c3999u3.f35246h.getClass();
                RB rb = c3676o3.f33633a;
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>(rb.size());
                int i4 = 0;
                PB listIterator = rb.listIterator(0);
                while (listIterator.hasNext()) {
                    C4302zj c4302zj = (C4302zj) listIterator.next();
                    c4302zj.getClass();
                    Bundle bundle = new Bundle();
                    CharSequence charSequence = c4302zj.f36201a;
                    if (charSequence != null) {
                        bundle.putCharSequence(C4302zj.f36191q, charSequence);
                        if (charSequence instanceof Spanned) {
                            Spanned spanned = (Spanned) charSequence;
                            String str = AbstractC3012bk.f30106a;
                            ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>();
                            C3764pk[] c3764pkArr = (C3764pk[]) spanned.getSpans(i4, spanned.length(), C3764pk.class);
                            int length = c3764pkArr.length;
                            for (int i6 = i4; i6 < length; i6++) {
                                C3764pk c3764pk = c3764pkArr[i6];
                                c3764pk.getClass();
                                Bundle bundle2 = new Bundle();
                                bundle2.putString(C3764pk.f33909c, c3764pk.f33911a);
                                bundle2.putInt(C3764pk.f33910d, c3764pk.f33912b);
                                arrayList2.add(AbstractC3012bk.a(spanned, c3764pk, 1, bundle2));
                            }
                            for (C2629Ik c2629Ik : (C2629Ik[]) spanned.getSpans(0, spanned.length(), C2629Ik.class)) {
                                c2629Ik.getClass();
                                Bundle bundle3 = new Bundle();
                                bundle3.putInt(C2629Ik.f26308d, c2629Ik.f26311a);
                                bundle3.putInt(C2629Ik.f26309e, c2629Ik.f26312b);
                                bundle3.putInt(C2629Ik.f26310f, c2629Ik.f26313c);
                                arrayList2.add(AbstractC3012bk.a(spanned, c2629Ik, 2, bundle3));
                            }
                            for (C3172ek c3172ek : (C3172ek[]) spanned.getSpans(0, spanned.length(), C3172ek.class)) {
                                arrayList2.add(AbstractC3012bk.a(spanned, c3172ek, 3, null));
                            }
                            for (C2765Qk c2765Qk : (C2765Qk[]) spanned.getSpans(0, spanned.length(), C2765Qk.class)) {
                                c2765Qk.getClass();
                                Bundle bundle4 = new Bundle();
                                bundle4.putString(C2765Qk.f27845b, c2765Qk.f27846a);
                                arrayList2.add(AbstractC3012bk.a(spanned, c2765Qk, 4, bundle4));
                            }
                            if (!arrayList2.isEmpty()) {
                                bundle.putParcelableArrayList(C4302zj.f36192r, arrayList2);
                            }
                        }
                    }
                    bundle.putSerializable(C4302zj.f36193s, c4302zj.f36202b);
                    bundle.putSerializable(C4302zj.f36194t, c4302zj.f36203c);
                    bundle.putFloat(C4302zj.f36196v, c4302zj.f36205e);
                    bundle.putInt(C4302zj.f36197w, c4302zj.f36206f);
                    bundle.putInt(C4302zj.f36198x, c4302zj.f36207g);
                    bundle.putFloat(C4302zj.f36199y, c4302zj.f36208h);
                    bundle.putInt(C4302zj.f36200z, c4302zj.i);
                    bundle.putInt(C4302zj.f36182A, c4302zj.f36211l);
                    bundle.putFloat(C4302zj.f36183B, c4302zj.f36212m);
                    bundle.putFloat(C4302zj.f36184C, c4302zj.f36209j);
                    bundle.putFloat(C4302zj.f36185D, c4302zj.f36210k);
                    bundle.putBoolean(C4302zj.f36187F, false);
                    bundle.putInt(C4302zj.f36186E, -16777216);
                    bundle.putInt(C4302zj.f36188G, c4302zj.f36213n);
                    bundle.putFloat(C4302zj.f36189H, c4302zj.f36214o);
                    bundle.putInt(C4302zj.f36190I, c4302zj.f36215p);
                    Bitmap bitmap = c4302zj.f36204d;
                    if (bitmap != null) {
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        i = 0;
                        AbstractC2792Sd.H(bitmap.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream));
                        bundle.putByteArray(C4302zj.f36195u, byteArrayOutputStream.toByteArray());
                    } else {
                        i = 0;
                    }
                    arrayList.add(bundle);
                    i4 = i;
                }
                boolean z6 = i4;
                Bundle bundle5 = new Bundle();
                bundle5.putParcelableArrayList("c", arrayList);
                bundle5.putLong("d", c3676o3.f33635c);
                Parcel obtain = Parcel.obtain();
                obtain.writeBundle(bundle5);
                byte[] marshall = obtain.marshall();
                obtain.recycle();
                int length2 = marshall.length;
                Cr cr = c3999u3.f35241c;
                cr.z(length2, marshall);
                InterfaceC3566m1 interfaceC3566m1 = c3999u3.f35239a;
                interfaceC3566m1.a(length2, cr);
                long j6 = c3676o3.f33634b;
                long j9 = this.f4112u;
                if (j6 == com.anythink.basead.exoplayer.b.f7168b) {
                    if (c3999u3.f35246h.f25181t == Long.MAX_VALUE) {
                        z6 = 1;
                    }
                    AbstractC2792Sd.H(z6);
                } else {
                    long j10 = c3999u3.f35246h.f25181t;
                    j9 = j10 == Long.MAX_VALUE ? j9 + j6 : j6 + j10;
                }
                interfaceC3566m1.c(j9, this.f4113v | 1, length2, 0, null);
                break;
            default:
                ((InterfaceC4236yO) obj).f((C4182xO) this.f4114w, this.f4113v, this.f4112u);
                break;
        }
    }

    public /* synthetic */ b(C3999u3 c3999u3, long j6, int i) {
        this.f4114w = c3999u3;
        this.f4112u = j6;
        this.f4113v = i;
    }

    public /* synthetic */ b(C4182xO c4182xO, int i, long j6, long j9) {
        this.f4114w = c4182xO;
        this.f4113v = i;
        this.f4112u = j6;
    }

    public b(int i, URL url, long j6) {
        this.f4113v = i;
        this.f4114w = url;
        this.f4112u = j6;
    }
}
