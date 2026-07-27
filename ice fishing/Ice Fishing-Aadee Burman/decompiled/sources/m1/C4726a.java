package m1;

import L3.h;
import O.A0;
import O.C0344t;
import O.InterfaceC0345u;
import O.y0;
import S0.f;
import S0.l;
import android.content.Context;
import android.graphics.Rect;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.anythink.expressad.video.module.a.a.m;
import com.bumptech.glide.manager.o;
import com.google.android.gms.ads.nativead.MediaView;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeAdView;
import com.google.android.gms.internal.ads.C3090de;
import com.google.android.gms.internal.ads.C3143ee;
import com.google.android.gms.internal.ads.W4;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.icefishing.icefishinglive2.C5275R;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.TreeMap;
import k2.v;
import l1.C4655a;
import l1.g;
import l1.j;
import o4.C4789b;
import s6.C4977a;
import u.AbstractC5049e;
import u.C5050f;
import y3.k;

/* renamed from: m1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4726a implements A2.b, InterfaceC0345u {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f39271n;

    /* renamed from: u, reason: collision with root package name */
    public Object f39272u;

    /* renamed from: v, reason: collision with root package name */
    public final Object f39273v;

    public /* synthetic */ C4726a(int i, Object obj) {
        this.f39271n = i;
        this.f39273v = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x018f A[LOOP:0: B:2:0x0004->B:57:0x018f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01ab A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00e3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public o a(C4729d c4729d) {
        Object obj;
        l lVar;
        String str;
        int i;
        int i6;
        Map map;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        while (true) {
            C4727b c4727b = null;
            try {
                W4 w42 = c4729d.f39290D;
                if (w42 == null) {
                    try {
                        map = Collections.EMPTY_MAP;
                    } catch (IOException e9) {
                        e = e9;
                        e = e;
                        obj = null;
                        if (e instanceof SocketTimeoutException) {
                        }
                        str = (String) lVar.f2797u;
                        C0344t c0344t = c4729d.f39289C;
                        i = c0344t.f2133a;
                        try {
                            g gVar = (g) lVar.f2798v;
                            i6 = c0344t.f2134b + 1;
                            c0344t.f2134b = i6;
                            c0344t.f2133a = ((int) (i * 1.0f)) + i;
                            if (i6 > 1) {
                            }
                        } catch (g e10) {
                            c4729d.a(str + "-timeout-giveup [timeout=" + i + "]");
                            throw e10;
                        }
                    }
                } else {
                    HashMap hashMap = new HashMap();
                    String str2 = w42.f28314b;
                    if (str2 != null) {
                        hashMap.put("If-None-Match", str2);
                    }
                    long j6 = w42.f28316d;
                    if (j6 > 0) {
                        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
                        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
                        hashMap.put("If-Modified-Since", simpleDateFormat.format(new Date(j6)));
                    }
                    map = hashMap;
                }
            } catch (IOException e11) {
                e = e11;
            }
            try {
                C4727b f3 = ((a4.e) this.f39272u).f(c4729d, map);
                try {
                    int i9 = f3.f39275a;
                    List unmodifiableList = Collections.unmodifiableList(f3.f39276b);
                    if (i9 == 304) {
                        SystemClock.elapsedRealtime();
                        return f.k(c4729d, unmodifiableList);
                    }
                    InputStream inputStream = (InputStream) f3.f39278d;
                    if (inputStream == null) {
                        inputStream = null;
                    }
                    byte[] m4 = inputStream != null ? f.m(inputStream, f3.f39277c, (C4727b) this.f39273v) : new byte[0];
                    long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                    if (j.f38901a || elapsedRealtime2 > m.ai) {
                        j.b("HTTP response for request=<%s> [lifetime=%d], [size=%s], [rc=%d], [retryCount=%s]", c4729d, Long.valueOf(elapsedRealtime2), m4 != null ? Integer.valueOf(m4.length) : "null", Integer.valueOf(i9), Integer.valueOf(c4729d.f39289C.f2134b));
                    }
                    if (i9 < 200 || i9 > 299) {
                        throw new IOException();
                    }
                    SystemClock.elapsedRealtime();
                    return new o(m4, false, unmodifiableList);
                } catch (IOException e12) {
                    e = e12;
                    obj = null;
                    c4727b = f3;
                    if (e instanceof SocketTimeoutException) {
                        lVar = new l(28, "socket", new C4655a());
                    } else {
                        boolean z3 = e instanceof MalformedURLException;
                        String str3 = c4729d.f39295u;
                        if (z3) {
                            throw new RuntimeException("Bad URL " + str3, e);
                        }
                        if (c4727b == null) {
                            throw new l1.f(e);
                        }
                        int i10 = c4727b.f39275a;
                        j.c("Unexpected response code %d for %s", Integer.valueOf(i10), str3);
                        if (obj != null) {
                            List<l1.d> unmodifiableList2 = Collections.unmodifiableList(c4727b.f39276b);
                            SystemClock.elapsedRealtime();
                            if (unmodifiableList2 != null) {
                                if (unmodifiableList2.isEmpty()) {
                                    Map map2 = Collections.EMPTY_MAP;
                                } else {
                                    TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
                                    for (l1.d dVar : unmodifiableList2) {
                                        treeMap.put(dVar.f38888a, dVar.f38889b);
                                    }
                                }
                            }
                            if (unmodifiableList2 != null) {
                                Collections.unmodifiableList(unmodifiableList2);
                            }
                            if (i10 != 401 && i10 != 403) {
                                if (i10 < 400 || i10 > 499) {
                                    throw new C4655a();
                                }
                                throw new l1.c();
                            }
                            lVar = new l(28, "auth", new C4655a());
                        } else {
                            lVar = new l(28, "network", new C4655a());
                        }
                    }
                    str = (String) lVar.f2797u;
                    C0344t c0344t2 = c4729d.f39289C;
                    i = c0344t2.f2133a;
                    g gVar2 = (g) lVar.f2798v;
                    i6 = c0344t2.f2134b + 1;
                    c0344t2.f2134b = i6;
                    c0344t2.f2133a = ((int) (i * 1.0f)) + i;
                    if (i6 > 1) {
                        throw gVar2;
                    }
                    c4729d.a(str + "-retry [timeout=" + i + "]");
                }
            } catch (IOException e13) {
                e = e13;
                e = e;
                obj = null;
                if (e instanceof SocketTimeoutException) {
                }
                str = (String) lVar.f2797u;
                C0344t c0344t22 = c4729d.f39289C;
                i = c0344t22.f2133a;
                g gVar22 = (g) lVar.f2798v;
                i6 = c0344t22.f2134b + 1;
                c0344t22.f2134b = i6;
                c0344t22.f2133a = ((int) (i * 1.0f)) + i;
                if (i6 > 1) {
                }
            }
            c4729d.a(str + "-retry [timeout=" + i + "]");
        }
    }

    public void b(int i, int i6, int i9, int i10) {
        CardView cardView = (CardView) this.f39273v;
        cardView.f4640w.set(i, i6, i9, i10);
        Rect rect = cardView.f4639v;
        super/*android.view.View*/.setPadding(i + rect.left, i6 + rect.top, i9 + rect.right, i10 + rect.bottom);
    }

    @Override // A2.b
    public void onNativeAdLoaded(NativeAd nativeAd) {
        LayoutInflater from = LayoutInflater.from((Context) this.f39272u);
        ViewGroup viewGroup = (ViewGroup) this.f39273v;
        NativeAdView nativeAdView = (NativeAdView) from.inflate(C5275R.layout.admob_native, viewGroup, false);
        nativeAdView.setMediaView((MediaView) nativeAdView.findViewById(C5275R.id.ad_media));
        nativeAdView.setHeadlineView(nativeAdView.findViewById(C5275R.id.ad_headline));
        nativeAdView.setBodyView(nativeAdView.findViewById(C5275R.id.ad_body));
        nativeAdView.setCallToActionView(nativeAdView.findViewById(C5275R.id.ad_call_to_action));
        nativeAdView.setIconView(nativeAdView.findViewById(C5275R.id.ad_app_icon));
        nativeAdView.setPriceView(nativeAdView.findViewById(C5275R.id.ad_price));
        nativeAdView.setStarRatingView(nativeAdView.findViewById(C5275R.id.ad_stars));
        nativeAdView.setStoreView(nativeAdView.findViewById(C5275R.id.ad_store));
        nativeAdView.setAdvertiserView(nativeAdView.findViewById(C5275R.id.ad_advertiser));
        ((TextView) nativeAdView.getHeadlineView()).setText(nativeAd.e());
        nativeAdView.getMediaView().setMediaContent(nativeAd.h());
        if (nativeAd.c() == null) {
            nativeAdView.getBodyView().setVisibility(4);
        } else {
            nativeAdView.getBodyView().setVisibility(0);
            ((TextView) nativeAdView.getBodyView()).setText(nativeAd.c());
        }
        if (nativeAd.d() == null) {
            nativeAdView.getCallToActionView().setVisibility(4);
        } else {
            nativeAdView.getCallToActionView().setVisibility(0);
            ((Button) nativeAdView.getCallToActionView()).setText(nativeAd.d());
        }
        C3090de c3090de = ((C3143ee) nativeAd).f29954c;
        if (c3090de == null) {
            nativeAdView.getIconView().setVisibility(8);
        } else {
            ((ImageView) nativeAdView.getIconView()).setImageDrawable(c3090de.f29787b);
            nativeAdView.getIconView().setVisibility(0);
        }
        if (nativeAd.i() == null) {
            nativeAdView.getPriceView().setVisibility(4);
        } else {
            nativeAdView.getPriceView().setVisibility(0);
            ((TextView) nativeAdView.getPriceView()).setText(nativeAd.i());
        }
        if (nativeAd.l() == null) {
            nativeAdView.getStoreView().setVisibility(4);
        } else {
            nativeAdView.getStoreView().setVisibility(0);
            ((TextView) nativeAdView.getStoreView()).setText(nativeAd.l());
        }
        if (nativeAd.k() == null) {
            nativeAdView.getStarRatingView().setVisibility(4);
        } else {
            ((RatingBar) nativeAdView.getStarRatingView()).setRating(nativeAd.k().floatValue());
            nativeAdView.getStarRatingView().setVisibility(0);
        }
        if (nativeAd.b() == null) {
            nativeAdView.getAdvertiserView().setVisibility(4);
        } else {
            ((TextView) nativeAdView.getAdvertiserView()).setText(nativeAd.b());
            nativeAdView.getAdvertiserView().setVisibility(0);
        }
        nativeAdView.setNativeAd(nativeAd);
        v a9 = nativeAd.h().a();
        if (nativeAd.h() != null && nativeAd.h().b()) {
            a9.a(new C4789b());
        }
        viewGroup.removeAllViews();
        viewGroup.addView(nativeAdView);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0099  */
    @Override // O.InterfaceC0345u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public A0 q(View view, A0 a02) {
        boolean z3;
        boolean z6;
        X2.b bVar = (X2.b) this.f39273v;
        int i = bVar.f3771a;
        h hVar = (h) this.f39272u;
        y0 y0Var = a02.f2027a;
        G.e f3 = y0Var.f(7);
        G.e f9 = y0Var.f(32);
        int i6 = f3.f1006b;
        BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) hVar.f1697u;
        bottomSheetBehavior.f35879w = i6;
        boolean e9 = k.e(view);
        int paddingBottom = view.getPaddingBottom();
        int paddingLeft = view.getPaddingLeft();
        int paddingRight = view.getPaddingRight();
        boolean z9 = bottomSheetBehavior.f35871o;
        if (z9) {
            int a9 = a02.a();
            bottomSheetBehavior.f35878v = a9;
            paddingBottom = a9 + bVar.f3773c;
        }
        int i9 = bVar.f3772b;
        boolean z10 = bottomSheetBehavior.f35872p;
        int i10 = f3.f1005a;
        if (z10) {
            paddingLeft = (e9 ? i9 : i) + i10;
        }
        boolean z11 = bottomSheetBehavior.f35873q;
        int i11 = f3.f1007c;
        if (z11) {
            if (!e9) {
                i = i9;
            }
            paddingRight = i + i11;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        boolean z12 = true;
        if (!bottomSheetBehavior.f35875s || marginLayoutParams.leftMargin == i10) {
            z3 = false;
        } else {
            marginLayoutParams.leftMargin = i10;
            z3 = true;
        }
        if (bottomSheetBehavior.f35876t && marginLayoutParams.rightMargin != i11) {
            marginLayoutParams.rightMargin = i11;
            z3 = true;
        }
        if (bottomSheetBehavior.f35877u) {
            int i12 = marginLayoutParams.topMargin;
            int i13 = f3.f1006b;
            if (i12 != i13) {
                marginLayoutParams.topMargin = i13;
                if (z12) {
                    view.setLayoutParams(marginLayoutParams);
                }
                view.setPadding(paddingLeft, view.getPaddingTop(), paddingRight, paddingBottom);
                z6 = hVar.f1696n;
                if (z6) {
                    bottomSheetBehavior.f35869m = f9.f1008d;
                }
                if (z9 && !z6) {
                    return a02;
                }
                bottomSheetBehavior.I();
                return a02;
            }
        }
        z12 = z3;
        if (z12) {
        }
        view.setPadding(paddingLeft, view.getPaddingTop(), paddingRight, paddingBottom);
        z6 = hVar.f1696n;
        if (z6) {
        }
        if (z9) {
        }
        bottomSheetBehavior.I();
        return a02;
    }

    public String toString() {
        switch (this.f39271n) {
            case 3:
                String str = "[ ";
                if (((C5050f) this.f39272u) != null) {
                    for (int i = 0; i < 9; i++) {
                        StringBuilder b9 = AbstractC5049e.b(str);
                        b9.append(((C5050f) this.f39272u).f40972A[i]);
                        b9.append(" ");
                        str = b9.toString();
                    }
                }
                StringBuilder c9 = AbstractC5049e.c(str, "] ");
                c9.append((C5050f) this.f39272u);
                return c9.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ C4726a(int i, Object obj, Object obj2) {
        this.f39271n = i;
        this.f39272u = obj;
        this.f39273v = obj2;
    }

    public C4726a(E6.b bVar, Duration duration) {
        this.f39271n = 4;
        Duration duration2 = C4977a.f40486u;
        this.f39272u = bVar;
        this.f39273v = duration;
    }

    public C4726a(a4.e eVar) {
        this.f39271n = 0;
        C4727b c4727b = new C4727b();
        this.f39272u = eVar;
        this.f39273v = c4727b;
    }
}
