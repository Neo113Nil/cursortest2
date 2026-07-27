package X1;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Spanned;
import com.google.android.gms.internal.ads.AbstractC2772Sd;
import com.google.android.gms.internal.ads.AbstractC2989bk;
import com.google.android.gms.internal.ads.C2609Ik;
import com.google.android.gms.internal.ads.C2745Qk;
import com.google.android.gms.internal.ads.C3149ek;
import com.google.android.gms.internal.ads.C3653o3;
import com.google.android.gms.internal.ads.C3741pk;
import com.google.android.gms.internal.ads.C3976u3;
import com.google.android.gms.internal.ads.C4159xO;
import com.google.android.gms.internal.ads.C4279zj;
import com.google.android.gms.internal.ads.Cr;
import com.google.android.gms.internal.ads.InterfaceC2992bn;
import com.google.android.gms.internal.ads.InterfaceC3529lo;
import com.google.android.gms.internal.ads.InterfaceC3543m1;
import com.google.android.gms.internal.ads.InterfaceC4213yO;
import com.google.android.gms.internal.ads.PB;
import com.google.android.gms.internal.ads.RB;
import java.io.ByteArrayOutputStream;
import java.net.URL;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class b implements InterfaceC2992bn, InterfaceC3529lo {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f3760n = 3;

    /* renamed from: u, reason: collision with root package name */
    public long f3761u;

    /* renamed from: v, reason: collision with root package name */
    public int f3762v;

    /* renamed from: w, reason: collision with root package name */
    public Object f3763w;

    public /* synthetic */ b() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.InterfaceC2992bn
    /* renamed from: a */
    public void mo10a(Object obj) {
        int i;
        switch (this.f3760n) {
            case 1:
                C3653o3 c3653o3 = (C3653o3) obj;
                C3976u3 c3976u3 = (C3976u3) this.f3763w;
                c3976u3.f34472h.getClass();
                RB rb = c3653o3.f32846a;
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>(rb.size());
                int i6 = 0;
                PB listIterator = rb.listIterator(0);
                while (listIterator.hasNext()) {
                    C4279zj c4279zj = (C4279zj) listIterator.next();
                    c4279zj.getClass();
                    Bundle bundle = new Bundle();
                    CharSequence charSequence = c4279zj.f35428a;
                    if (charSequence != null) {
                        bundle.putCharSequence(C4279zj.f35418q, charSequence);
                        if (charSequence instanceof Spanned) {
                            Spanned spanned = (Spanned) charSequence;
                            String str = AbstractC2989bk.f29317a;
                            ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>();
                            C3741pk[] c3741pkArr = (C3741pk[]) spanned.getSpans(i6, spanned.length(), C3741pk.class);
                            int length = c3741pkArr.length;
                            for (int i9 = i6; i9 < length; i9++) {
                                C3741pk c3741pk = c3741pkArr[i9];
                                c3741pk.getClass();
                                Bundle bundle2 = new Bundle();
                                bundle2.putString(C3741pk.f33120c, c3741pk.f33122a);
                                bundle2.putInt(C3741pk.f33121d, c3741pk.f33123b);
                                arrayList2.add(AbstractC2989bk.a(spanned, c3741pk, 1, bundle2));
                            }
                            for (C2609Ik c2609Ik : (C2609Ik[]) spanned.getSpans(0, spanned.length(), C2609Ik.class)) {
                                c2609Ik.getClass();
                                Bundle bundle3 = new Bundle();
                                bundle3.putInt(C2609Ik.f25559d, c2609Ik.f25562a);
                                bundle3.putInt(C2609Ik.f25560e, c2609Ik.f25563b);
                                bundle3.putInt(C2609Ik.f25561f, c2609Ik.f25564c);
                                arrayList2.add(AbstractC2989bk.a(spanned, c2609Ik, 2, bundle3));
                            }
                            for (C3149ek c3149ek : (C3149ek[]) spanned.getSpans(0, spanned.length(), C3149ek.class)) {
                                arrayList2.add(AbstractC2989bk.a(spanned, c3149ek, 3, null));
                            }
                            for (C2745Qk c2745Qk : (C2745Qk[]) spanned.getSpans(0, spanned.length(), C2745Qk.class)) {
                                c2745Qk.getClass();
                                Bundle bundle4 = new Bundle();
                                bundle4.putString(C2745Qk.f27060b, c2745Qk.f27061a);
                                arrayList2.add(AbstractC2989bk.a(spanned, c2745Qk, 4, bundle4));
                            }
                            if (!arrayList2.isEmpty()) {
                                bundle.putParcelableArrayList(C4279zj.f35419r, arrayList2);
                            }
                        }
                    }
                    bundle.putSerializable(C4279zj.f35420s, c4279zj.f35429b);
                    bundle.putSerializable(C4279zj.f35421t, c4279zj.f35430c);
                    bundle.putFloat(C4279zj.f35423v, c4279zj.f35432e);
                    bundle.putInt(C4279zj.f35424w, c4279zj.f35433f);
                    bundle.putInt(C4279zj.f35425x, c4279zj.f35434g);
                    bundle.putFloat(C4279zj.f35426y, c4279zj.f35435h);
                    bundle.putInt(C4279zj.f35427z, c4279zj.i);
                    bundle.putInt(C4279zj.f35409A, c4279zj.f35438l);
                    bundle.putFloat(C4279zj.f35410B, c4279zj.f35439m);
                    bundle.putFloat(C4279zj.f35411C, c4279zj.f35436j);
                    bundle.putFloat(C4279zj.f35412D, c4279zj.f35437k);
                    bundle.putBoolean(C4279zj.f35414F, false);
                    bundle.putInt(C4279zj.f35413E, -16777216);
                    bundle.putInt(C4279zj.f35415G, c4279zj.f35440n);
                    bundle.putFloat(C4279zj.f35416H, c4279zj.f35441o);
                    bundle.putInt(C4279zj.f35417I, c4279zj.f35442p);
                    Bitmap bitmap = c4279zj.f35431d;
                    if (bitmap != null) {
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        i = 0;
                        AbstractC2772Sd.H(bitmap.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream));
                        bundle.putByteArray(C4279zj.f35422u, byteArrayOutputStream.toByteArray());
                    } else {
                        i = 0;
                    }
                    arrayList.add(bundle);
                    i6 = i;
                }
                boolean z3 = i6;
                Bundle bundle5 = new Bundle();
                bundle5.putParcelableArrayList("c", arrayList);
                bundle5.putLong("d", c3653o3.f32848c);
                Parcel obtain = Parcel.obtain();
                obtain.writeBundle(bundle5);
                byte[] marshall = obtain.marshall();
                obtain.recycle();
                int length2 = marshall.length;
                Cr cr = c3976u3.f34467c;
                cr.z(length2, marshall);
                InterfaceC3543m1 interfaceC3543m1 = c3976u3.f34465a;
                interfaceC3543m1.a(length2, cr);
                long j6 = c3653o3.f32847b;
                long j9 = this.f3761u;
                if (j6 == com.anythink.basead.exoplayer.b.f6382b) {
                    if (c3976u3.f34472h.f24436t == Long.MAX_VALUE) {
                        z3 = 1;
                    }
                    AbstractC2772Sd.H(z3);
                } else {
                    long j10 = c3976u3.f34472h.f24436t;
                    j9 = j10 == Long.MAX_VALUE ? j9 + j6 : j6 + j10;
                }
                interfaceC3543m1.c(j9, this.f3762v | 1, length2, 0, null);
                break;
            default:
                ((InterfaceC4213yO) obj).f((C4159xO) this.f3763w, this.f3762v, this.f3761u);
                break;
        }
    }

    public /* synthetic */ b(C3976u3 c3976u3, long j6, int i) {
        this.f3763w = c3976u3;
        this.f3761u = j6;
        this.f3762v = i;
    }

    public /* synthetic */ b(C4159xO c4159xO, int i, long j6, long j9) {
        this.f3763w = c4159xO;
        this.f3762v = i;
        this.f3761u = j6;
    }

    public b(int i, URL url, long j6) {
        this.f3762v = i;
        this.f3763w = url;
        this.f3761u = j6;
    }
}
