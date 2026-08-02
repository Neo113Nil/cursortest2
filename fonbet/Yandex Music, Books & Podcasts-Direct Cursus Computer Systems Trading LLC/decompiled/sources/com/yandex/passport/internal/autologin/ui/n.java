package com.yandex.passport.internal.autologin.ui;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.ParcelFormatException;
import com.yandex.passport.api.a1;
import com.yandex.passport.api.b1;
import com.yandex.passport.api.c0;
import com.yandex.passport.api.c1;
import com.yandex.passport.api.d2;
import com.yandex.passport.api.e0;
import com.yandex.passport.api.e2;
import com.yandex.passport.api.exception.t;
import com.yandex.passport.api.f2;
import com.yandex.passport.api.g0;
import com.yandex.passport.api.g2;
import com.yandex.passport.api.x0;
import com.yandex.passport.api.y0;
import com.yandex.passport.api.z0;
import com.yandex.passport.api.z1;
import com.yandex.passport.internal.impl.t0;
import com.yandex.passport.internal.properties.d0;
import com.yandex.passport.internal.properties.h0;
import com.yandex.passport.internal.properties.j0;
import defpackage.avf;
import defpackage.c5b;
import defpackage.k5r;
import defpackage.l1j;
import defpackage.r7o;
import defpackage.t7o;
import defpackage.uh;
import defpackage.xq0;
import defpackage.z7o;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.io.Serializable;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class n extends uh {
    public final /* synthetic */ int a;
    public final com.yandex.passport.api.i b;

    public n(com.yandex.passport.api.i iVar, int i) {
        this.a = i;
        switch (i) {
            case 1:
                iVar.getClass();
                this.b = iVar;
                break;
            case 2:
                iVar.getClass();
                this.b = iVar;
                break;
            case 3:
                iVar.getClass();
                this.b = iVar;
                break;
            case 4:
                iVar.getClass();
                this.b = iVar;
                break;
            case 5:
                iVar.getClass();
                this.b = iVar;
                break;
            case 6:
            case 7:
            case 8:
            default:
                iVar.getClass();
                this.b = iVar;
                break;
            case 9:
                iVar.getClass();
                this.b = iVar;
                break;
            case 10:
                iVar.getClass();
                this.b = iVar;
                break;
            case 11:
                iVar.getClass();
                this.b = iVar;
                break;
            case 12:
                iVar.getClass();
                this.b = iVar;
                break;
        }
    }

    @Override // defpackage.uh
    public final Intent createIntent(Context context, Object obj) {
        switch (this.a) {
            case 0:
                m mVar = (m) obj;
                context.getClass();
                mVar.getClass();
                return this.b.o(context, mVar.b.a, mVar.a);
            case 1:
                com.yandex.passport.internal.properties.b bVar = (com.yandex.passport.internal.properties.b) obj;
                context.getClass();
                bVar.getClass();
                return this.b.k(context, bVar);
            case 2:
                x0 x0Var = (x0) obj;
                context.getClass();
                x0Var.getClass();
                return this.b.d(context, x0Var);
            case 3:
                com.yandex.passport.internal.properties.c cVar = (com.yandex.passport.internal.properties.c) obj;
                context.getClass();
                cVar.getClass();
                return this.b.a(context, cVar);
            case 4:
                com.yandex.passport.internal.properties.h hVar = (com.yandex.passport.internal.properties.h) obj;
                context.getClass();
                hVar.getClass();
                return this.b.b(context, hVar);
            case 5:
                Uri uri = (Uri) obj;
                context.getClass();
                uri.getClass();
                return this.b.j(context, uri);
            case 6:
                context.getClass();
                if (obj == null) {
                    return this.b.h(context);
                }
                l1j.f();
                return null;
            case 7:
                context.getClass();
                return this.b.m(context, (h0) obj);
            case 8:
                context.getClass();
                return this.b.n(context, (d0) obj);
            case 9:
                z1 z1Var = (z1) obj;
                context.getClass();
                z1Var.getClass();
                return this.b.g(context, z1Var);
            case 10:
                g0 g0Var = (g0) obj;
                context.getClass();
                g0Var.getClass();
                return this.b.l(context, g0Var);
            case 11:
                y0 y0Var = (y0) obj;
                context.getClass();
                y0Var.getClass();
                return this.b.e(context, y0Var);
            default:
                j0 j0Var = (j0) obj;
                context.getClass();
                j0Var.getClass();
                return this.b.c(context, j0Var);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:173:0x0252, code lost:
    
        if (r7 == null) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0075, code lost:
    
        if (r7 == null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00d6, code lost:
    
        if (r7 == null) goto L64;
     */
    @Override // defpackage.uh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object parseResult(int i, Intent intent) {
        Object t7oVar;
        Throwable illegalArgumentException;
        Bundle extras;
        Object obj;
        Object t7oVar2;
        Object obj2;
        Throwable illegalArgumentException2;
        Bundle extras2;
        Bundle extras3;
        String string;
        Throwable illegalArgumentException3;
        Bundle extras4;
        Bundle extras5;
        String string2;
        String string3;
        Bundle bundle = null;
        switch (this.a) {
            case 0:
                if (intent != null) {
                    try {
                        bundle = intent.getExtras();
                    } catch (Exception unused) {
                        IllegalStateException illegalStateException = new IllegalStateException("Internal error: Required response data is missing: uid");
                        r7o r7oVar = z7o.b;
                        t7oVar = new t7o(illegalStateException);
                    }
                }
                bundle.getClass();
                bundle.setClassLoader(com.yandex.passport.internal.util.p.class.getClassLoader());
                z1 z1Var = (z1) bundle.getParcelable("passport-uid");
                if (z1Var != null) {
                    t7oVar = avf.u(z1Var);
                    return new z7o(t7oVar);
                }
                throw new ParcelFormatException("Invalid parcelable " + z1.class.getSimpleName() + " in the bundle");
            case 1:
                return com.yandex.passport.api.q.c(i, intent);
            case 2:
                return com.yandex.passport.api.q.c(i, intent);
            case 3:
                return com.yandex.passport.api.q.c(i, intent);
            case 4:
                return com.yandex.passport.api.q.c(i, intent);
            case 5:
                if (i == -1 || i == 0) {
                    return e0.a;
                }
                if (i == 13) {
                    if (intent != null && (extras = intent.getExtras()) != null) {
                        Serializable serializable = extras.getSerializable(Constants.KEY_EXCEPTION);
                        illegalArgumentException = (Throwable) (serializable instanceof Throwable ? serializable : null);
                        break;
                    }
                    illegalArgumentException = new IllegalArgumentException("Throwable is missing in data");
                    return new c0(illegalArgumentException);
                }
                if (i != 42) {
                    return new c0(new IllegalStateException(k5r.i(i, "Unknown resultCode=")));
                }
                Bundle extras6 = intent != null ? intent.getExtras() : null;
                String str = extras6 == null ? "Bundle is empty" : !extras6.containsKey("passport-result-url") ? "Environment" : !extras6.containsKey("passport-result-purpose") ? "Uid" : null;
                if (str != null) {
                    return new c0(new IllegalStateException("Internal error: Required response data is missing: ".concat(str)));
                }
                if (extras6 == null) {
                    xq0.q("Internal error");
                    return null;
                }
                String string4 = extras6.getString("passport-result-url");
                if (string4 == null) {
                    xq0.q("can't get required string passport-result-url");
                    return null;
                }
                String string5 = extras6.getString("passport-result-purpose");
                if (string5 != null) {
                    return new com.yandex.passport.api.d0(string4, string5);
                }
                xq0.q("can't get required string passport-result-purpose");
                return null;
            case 6:
                if (intent == null) {
                    r7o r7oVar2 = z7o.b;
                    obj = new t7o(new com.yandex.passport.api.exception.c());
                } else if (i == -1) {
                    r7o r7oVar3 = z7o.b;
                    obj = Unit.a;
                } else if (i != 13) {
                    r7o r7oVar4 = z7o.b;
                    obj = new t7o(new com.yandex.passport.api.exception.c());
                } else {
                    Bundle extras7 = intent.getExtras();
                    if (extras7 != null) {
                        Serializable serializable2 = extras7.getSerializable(Constants.KEY_EXCEPTION);
                        Exception exc = (Exception) (serializable2 instanceof Exception ? serializable2 : null);
                        if (exc != null) {
                            r7o r7oVar5 = z7o.b;
                            obj = new t7o(exc);
                        }
                    }
                    r7o r7oVar6 = z7o.b;
                    obj = new t7o(new com.yandex.passport.api.exception.c());
                }
                return new z7o(obj);
            case 7:
                if (intent == null) {
                    r7o r7oVar7 = z7o.b;
                    obj2 = new t7o(new t("Activity result parsing failed", c5b.a));
                } else {
                    if (i == -1) {
                        try {
                            r7o r7oVar8 = z7o.b;
                            t7oVar2 = com.yandex.passport.api.m.b(intent);
                        } catch (Throwable th) {
                            r7o r7oVar9 = z7o.b;
                            t7oVar2 = new t7o(th);
                        }
                    } else if (i != 13) {
                        r7o r7oVar10 = z7o.b;
                        obj2 = new t7o(new t("Activity result parsing failed", c5b.a));
                    } else {
                        Bundle extras8 = intent.getExtras();
                        if (extras8 != null) {
                            Serializable serializable3 = extras8.getSerializable(Constants.KEY_EXCEPTION);
                            Exception exc2 = (Exception) (serializable3 instanceof Exception ? serializable3 : null);
                            if (exc2 != null) {
                                r7o r7oVar11 = z7o.b;
                                t7oVar2 = new t7o(exc2);
                            }
                        }
                        r7o r7oVar12 = z7o.b;
                        obj2 = new t7o(new t("Activity result parsing failed", c5b.a));
                    }
                    obj2 = t7oVar2;
                }
                return new z7o(obj2);
            case 8:
                if (intent == null) {
                    return Boolean.valueOf(i == -1);
                }
                if (i == -1) {
                    return Boolean.TRUE;
                }
                return Boolean.valueOf(i == -1);
            case 9:
                return com.yandex.passport.api.q.d(i, intent);
            case 10:
                return com.yandex.passport.api.q.d(i, intent);
            case 11:
                if (i == -1) {
                    return c1.a;
                }
                if (i == 0 || i == 4) {
                    return z0.a;
                }
                if (i != 13) {
                    return b1.a;
                }
                if (intent != null && (extras2 = intent.getExtras()) != null) {
                    Serializable serializable4 = extras2.getSerializable(Constants.KEY_EXCEPTION);
                    illegalArgumentException2 = (Throwable) (serializable4 instanceof Throwable ? serializable4 : null);
                    break;
                }
                illegalArgumentException2 = new IllegalArgumentException("Throwable is missing in data");
                return new a1(illegalArgumentException2);
            default:
                if (i == -1) {
                    if (intent == null || (extras3 = intent.getExtras()) == null || (string = extras3.getString("item", null)) == null) {
                        return new e2(new IllegalArgumentException("Item is missing in data"));
                    }
                    Bundle extras9 = intent.getExtras();
                    return new f2(string, extras9 != null ? extras9.getString("params", null) : null);
                }
                if (i == 0) {
                    return d2.a;
                }
                if (i == 13) {
                    if (intent != null && (extras4 = intent.getExtras()) != null) {
                        Serializable serializable5 = extras4.getSerializable(Constants.KEY_EXCEPTION);
                        illegalArgumentException3 = (Throwable) (serializable5 instanceof Throwable ? serializable5 : null);
                        break;
                    }
                    illegalArgumentException3 = new IllegalArgumentException("Throwable is missing in data");
                    return new e2(illegalArgumentException3);
                }
                if (i != 42) {
                    return new e2(new IllegalStateException(k5r.i(i, "Unknown resultCode=")));
                }
                if (intent == null || (extras5 = intent.getExtras()) == null || (string2 = extras5.getString("url", null)) == null) {
                    return new e2(new IllegalArgumentException("Url is missing in data"));
                }
                Bundle extras10 = intent.getExtras();
                String str2 = "";
                if (extras10 != null && (string3 = extras10.getString("purpose", "")) != null) {
                    str2 = string3;
                }
                return new g2(string2, str2);
        }
    }

    public /* synthetic */ n(com.yandex.passport.api.i iVar, int i, boolean z) {
        this.a = i;
        this.b = iVar;
    }

    public n(com.yandex.passport.api.i iVar, t0 t0Var) {
        this.a = 7;
        this.b = iVar;
    }
}
