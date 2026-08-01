package l;

import C2.J;
import O.InterfaceC0341p;
import O.X;
import android.content.res.Resources;
import android.net.Uri;
import android.os.SystemClock;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.F;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.ads.internal.client.hsdp.HsdpDeepLinkServiceWrapper;
import com.google.android.gms.internal.ads.C2941aq;
import com.google.android.material.behavior.SwipeDismissBehavior;
import g1.C4522b;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import m.C0;
import m.C4695k;
import m.b1;
import s1.InterfaceC4967b;
import t0.AbstractC4990E;
import t0.C4991F;
import t0.a0;
import y1.C5207b;
import y1.C5208c;
import y1.InterfaceC5223r;
import y1.InterfaceC5224s;

/* renamed from: l.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4648e implements C0, x, k, P.u, a0, O1.a, InterfaceC5224s, InterfaceC4967b {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f38760n;

    /* renamed from: u, reason: collision with root package name */
    public Object f38761u;

    public /* synthetic */ C4648e(int i) {
        this.f38760n = i;
    }

    @Override // P.u
    public boolean a(View view) {
        SwipeDismissBehavior swipeDismissBehavior = (SwipeDismissBehavior) this.f38761u;
        if (!swipeDismissBehavior.r(view)) {
            return false;
        }
        WeakHashMap weakHashMap = X.f2054a;
        boolean z3 = view.getLayoutDirection() == 1;
        int i = swipeDismissBehavior.f35826d;
        view.offsetLeftAndRight((!(i == 0 && z3) && (i != 1 || z3)) ? view.getWidth() : -view.getWidth());
        view.setAlpha(0.0f);
        return true;
    }

    @Override // l.x
    public void b(m mVar, boolean z3) {
        if (mVar instanceof SubMenuC4643E) {
            ((SubMenuC4643E) mVar).f38738S.k().c(false);
        }
        x xVar = ((C4695k) this.f38761u).f39176x;
        if (xVar != null) {
            xVar.b(mVar, z3);
        }
    }

    @Override // m.C0
    public void c(m mVar, o oVar) {
        ((ViewOnKeyListenerC4650g) this.f38761u).f38787y.removeCallbacksAndMessages(mVar);
    }

    @Override // s1.InterfaceC4967b
    public boolean d(Object obj, File file, s1.h hVar) {
        InputStream inputStream = (InputStream) obj;
        C2941aq c2941aq = (C2941aq) this.f38761u;
        byte[] bArr = (byte[]) c2941aq.f(com.anythink.basead.exoplayer.b.aX, byte[].class);
        FileOutputStream fileOutputStream = null;
        try {
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                while (true) {
                    try {
                        int read = inputStream.read(bArr);
                        if (read == -1) {
                            break;
                        }
                        fileOutputStream2.write(bArr, 0, read);
                    } catch (IOException e9) {
                        e = e9;
                        fileOutputStream = fileOutputStream2;
                        if (Log.isLoggable("StreamEncoder", 3)) {
                            Log.d("StreamEncoder", "Failed to encode data onto the OutputStream", e);
                        }
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused) {
                            }
                        }
                        c2941aq.k(bArr);
                        return false;
                    } catch (Throwable th) {
                        th = th;
                        fileOutputStream = fileOutputStream2;
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused2) {
                            }
                        }
                        c2941aq.k(bArr);
                        throw th;
                    }
                }
                fileOutputStream2.close();
                try {
                    fileOutputStream2.close();
                } catch (IOException unused3) {
                }
                c2941aq.k(bArr);
                return true;
            } catch (IOException e10) {
                e = e10;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // t0.a0
    public int e(View view) {
        C4991F c4991f = (C4991F) view.getLayoutParams();
        ((AbstractC4990E) this.f38761u).getClass();
        return (view.getTop() - ((C4991F) view.getLayoutParams()).f40555b.top) - ((ViewGroup.MarginLayoutParams) c4991f).topMargin;
    }

    @Override // O1.a
    public Object f() {
        b1 b1Var = (b1) this.f38761u;
        return new u1.p((x1.d) b1Var.f39121n, (x1.d) b1Var.f39122u, (x1.d) b1Var.f39123v, (x1.d) b1Var.f39124w, (u1.l) b1Var.f39125x, (u1.l) b1Var.f39126y, (Z2.e) b1Var.f39127z);
    }

    @Override // t0.a0
    public int g() {
        return ((AbstractC4990E) this.f38761u).G();
    }

    @Override // t0.a0
    public int h() {
        AbstractC4990E abstractC4990E = (AbstractC4990E) this.f38761u;
        return abstractC4990E.f40553o - abstractC4990E.D();
    }

    @Override // y1.InterfaceC5224s
    public InterfaceC5223r i(y1.x xVar) {
        switch (this.f38760n) {
            case 12:
                return new C5208c(1, (y1.z) this.f38761u);
            default:
                return new C5207b((Resources) this.f38761u, xVar.b(Uri.class, InputStream.class));
        }
    }

    @Override // l.x
    public boolean j(m mVar) {
        C4695k c4695k = (C4695k) this.f38761u;
        if (mVar == c4695k.f39174v) {
            return false;
        }
        ((SubMenuC4643E) mVar).f38739T.getClass();
        c4695k.getClass();
        x xVar = c4695k.f39176x;
        if (xVar != null) {
            return xVar.j(mVar);
        }
        return false;
    }

    @Override // l.k
    public void k(m mVar) {
        Toolbar toolbar = (Toolbar) this.f38761u;
        C4695k c4695k = toolbar.f4609n.f4562M;
        if (c4695k == null || !c4695k.k()) {
            Iterator it = toolbar.f4612p0.f2112b.iterator();
            while (it.hasNext()) {
                ((F) ((InterfaceC0341p) it.next())).f4824a.s();
            }
        }
        C4522b c4522b = toolbar.f4624x0;
        if (c4522b != null) {
            c4522b.k(mVar);
        }
    }

    @Override // m.C0
    public void l(m mVar, o oVar) {
        ViewOnKeyListenerC4650g viewOnKeyListenerC4650g = (ViewOnKeyListenerC4650g) this.f38761u;
        viewOnKeyListenerC4650g.f38787y.removeCallbacksAndMessages(null);
        ArrayList arrayList = viewOnKeyListenerC4650g.f38765A;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (mVar == ((C4649f) arrayList.get(i)).f38763b) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            return;
        }
        int i6 = i + 1;
        viewOnKeyListenerC4650g.f38787y.postAtTime(new J(this, i6 < arrayList.size() ? (C4649f) arrayList.get(i6) : null, oVar, mVar, 8, false), mVar, SystemClock.uptimeMillis() + 200);
    }

    @Override // t0.a0
    public View m(int i) {
        return ((AbstractC4990E) this.f38761u).u(i);
    }

    @Override // t0.a0
    public int n(View view) {
        C4991F c4991f = (C4991F) view.getLayoutParams();
        ((AbstractC4990E) this.f38761u).getClass();
        return view.getBottom() + ((C4991F) view.getLayoutParams()).f40555b.bottom + ((ViewGroup.MarginLayoutParams) c4991f).bottomMargin;
    }

    public void o(int i) {
        RecyclerView recyclerView = (RecyclerView) this.f38761u;
        View childAt = recyclerView.getChildAt(i);
        if (childAt != null) {
            RecyclerView.I(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i);
    }

    @Override // l.k
    public boolean q(m mVar, MenuItem menuItem) {
        C4522b c4522b = ((Toolbar) this.f38761u).f4624x0;
        return false;
    }

    public /* synthetic */ C4648e(int i, Object obj) {
        this.f38760n = i;
        this.f38761u = obj;
    }

    public C4648e(HsdpDeepLinkServiceWrapper hsdpDeepLinkServiceWrapper, r2.e eVar) {
        this.f38760n = 5;
        this.f38761u = eVar;
    }

    public C4648e() {
        this.f38760n = 12;
        this.f38761u = new y1.z(7);
    }
}
