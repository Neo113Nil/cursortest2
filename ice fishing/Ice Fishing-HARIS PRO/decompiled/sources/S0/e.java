package S0;

import O.K;
import O.j0;
import a.AbstractC0078a;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.Selection;
import android.util.Log;
import android.view.View;
import androidx.lifecycle.EnumC0097n;
import androidx.lifecycle.Q;
import androidx.lifecycle.T;
import c0.C0122c;
import f0.C0141f;
import f0.C0150o;
import f0.w;
import java.io.Serializable;
import java.util.UUID;
import java.util.WeakHashMap;
import l.MenuC0229m;
import l.x;
import u0.AbstractC0358a;

/* loaded from: classes.dex */
public class e implements L0.o, T, i0.e, x {

    /* renamed from: b, reason: collision with root package name */
    public static e f1059b;

    /* renamed from: c, reason: collision with root package name */
    public static e f1060c;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1061a;

    public /* synthetic */ e(int i) {
        this.f1061a = i;
    }

    public static e d(Context context, int i) {
        AbstractC0078a.e("Cannot create a CalendarItemStyle with a styleResId of 0", i != 0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, AbstractC0358a.f4451p);
        Rect rect = new Rect(obtainStyledAttributes.getDimensionPixelOffset(0, 0), obtainStyledAttributes.getDimensionPixelOffset(2, 0), obtainStyledAttributes.getDimensionPixelOffset(1, 0), obtainStyledAttributes.getDimensionPixelOffset(3, 0));
        AbstractC0078a.B(context, obtainStyledAttributes, 4);
        AbstractC0078a.B(context, obtainStyledAttributes, 9);
        AbstractC0078a.B(context, obtainStyledAttributes, 7);
        obtainStyledAttributes.getDimensionPixelSize(8, 0);
        k.a(context, obtainStyledAttributes.getResourceId(5, 0), obtainStyledAttributes.getResourceId(6, 0), new a(0)).a();
        obtainStyledAttributes.recycle();
        e eVar = new e(22);
        AbstractC0078a.f(rect.left);
        AbstractC0078a.f(rect.top);
        AbstractC0078a.f(rect.right);
        AbstractC0078a.f(rect.bottom);
        return eVar;
    }

    public static C0141f e(Context context, w wVar, Bundle bundle, EnumC0097n enumC0097n, C0150o c0150o) {
        String uuid = UUID.randomUUID().toString();
        D1.i.d(uuid, "randomUUID().toString()");
        D1.i.e(wVar, "destination");
        D1.i.e(enumC0097n, "hostLifecycleState");
        return new C0141f(context, wVar, bundle, enumC0097n, c0150o, uuid, null);
    }

    public static Path f(float f2, float f3, float f4, float f5) {
        Path path = new Path();
        path.moveTo(f2, f3);
        path.lineTo(f4, f5);
        return path;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0045, code lost:
    
        if (java.lang.Character.isHighSurrogate(r5) != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0082, code lost:
    
        if (java.lang.Character.isLowSurrogate(r5) != false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0075, code lost:
    
        if (r11 != false) goto L46;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean i(X.b bVar, Editable editable, int i, int i2, boolean z2) {
        int min;
        if (editable == null || i < 0 || i2 < 0) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (selectionStart == -1 || selectionEnd == -1 || selectionStart != selectionEnd) {
            return false;
        }
        if (z2) {
            int max = Math.max(i, 0);
            int length = editable.length();
            if (selectionStart >= 0 && length >= selectionStart && max >= 0) {
                loop0: while (true) {
                    boolean z3 = false;
                    while (true) {
                        if (max == 0) {
                            break loop0;
                        }
                        selectionStart--;
                        if (selectionStart >= 0) {
                            char charAt = editable.charAt(selectionStart);
                            if (z3) {
                                break;
                            }
                            if (!Character.isSurrogate(charAt)) {
                                max--;
                            } else {
                                if (Character.isHighSurrogate(charAt)) {
                                    break loop0;
                                }
                                z3 = true;
                            }
                        } else if (!z3) {
                            selectionStart = 0;
                        }
                    }
                    max--;
                }
            }
            selectionStart = -1;
            int max2 = Math.max(i2, 0);
            min = editable.length();
            if (selectionEnd >= 0 && min >= selectionEnd && max2 >= 0) {
                loop2: while (true) {
                    boolean z4 = false;
                    while (true) {
                        if (max2 == 0) {
                            min = selectionEnd;
                            break loop2;
                        }
                        if (selectionEnd < min) {
                            char charAt2 = editable.charAt(selectionEnd);
                            if (z4) {
                                break;
                            }
                            if (!Character.isSurrogate(charAt2)) {
                                max2--;
                                selectionEnd++;
                            } else {
                                if (Character.isLowSurrogate(charAt2)) {
                                    break loop2;
                                }
                                selectionEnd++;
                                z4 = true;
                            }
                        }
                    }
                    max2--;
                    selectionEnd++;
                }
            }
            min = -1;
            if (selectionStart == -1 || min == -1) {
                return false;
            }
        } else {
            selectionStart = Math.max(selectionStart - i, 0);
            min = Math.min(selectionEnd + i2, editable.length());
        }
        V.x[] xVarArr = (V.x[]) editable.getSpans(selectionStart, min, V.x.class);
        if (xVarArr == null || xVarArr.length <= 0) {
            return false;
        }
        for (V.x xVar : xVarArr) {
            int spanStart = editable.getSpanStart(xVar);
            int spanEnd = editable.getSpanEnd(xVar);
            selectionStart = Math.min(spanStart, selectionStart);
            min = Math.max(spanEnd, min);
        }
        int max3 = Math.max(selectionStart, 0);
        int min2 = Math.min(min, editable.length());
        bVar.beginBatchEdit();
        editable.delete(max3, min2);
        bVar.endBatchEdit();
        return true;
    }

    private final void n() {
    }

    private final void o(int i, Serializable serializable) {
    }

    @Override // L0.o
    public j0 a(View view, j0 j0Var, L0.p pVar) {
        pVar.f523d = j0Var.a() + pVar.f523d;
        WeakHashMap weakHashMap = K.f747a;
        boolean z2 = view.getLayoutDirection() == 1;
        int b2 = j0Var.b();
        int c2 = j0Var.c();
        int i = pVar.f520a + (z2 ? c2 : b2);
        pVar.f520a = i;
        int i2 = pVar.f522c;
        if (!z2) {
            b2 = c2;
        }
        int i3 = i2 + b2;
        pVar.f522c = i3;
        view.setPaddingRelative(i, pVar.f521b, i3, pVar.f523d);
        return j0Var;
    }

    @Override // l.x
    public void b(MenuC0229m menuC0229m, boolean z2) {
    }

    public float c(float f2, float f3) {
        return 1.0f;
    }

    @Override // androidx.lifecycle.T
    public Q g(Class cls) {
        try {
            Object newInstance = cls.getDeclaredConstructor(null).newInstance(null);
            D1.i.d(newInstance, "{\n            modelClass…).newInstance()\n        }");
            return (Q) newInstance;
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Cannot create an instance of " + cls, e);
        } catch (InstantiationException e2) {
            throw new RuntimeException("Cannot create an instance of " + cls, e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("Cannot create an instance of " + cls, e3);
        }
    }

    public Signature[] h(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }

    @Override // l.x
    public boolean j(MenuC0229m menuC0229m) {
        return false;
    }

    public boolean k(CharSequence charSequence) {
        return false;
    }

    @Override // i0.e
    public void l(int i, Serializable serializable) {
        String str;
        switch (this.f1061a) {
            case 24:
                break;
            default:
                switch (i) {
                    case 1:
                        str = "RESULT_INSTALL_SUCCESS";
                        break;
                    case 2:
                        str = "RESULT_ALREADY_INSTALLED";
                        break;
                    case 3:
                        str = "RESULT_UNSUPPORTED_ART_VERSION";
                        break;
                    case 4:
                        str = "RESULT_NOT_WRITABLE";
                        break;
                    case 5:
                        str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                        break;
                    case 6:
                        str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                        break;
                    case 7:
                        str = "RESULT_IO_EXCEPTION";
                        break;
                    case 8:
                        str = "RESULT_PARSE_EXCEPTION";
                        break;
                    case 9:
                    default:
                        str = "";
                        break;
                    case 10:
                        str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                        break;
                    case 11:
                        str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                        break;
                }
                if (i != 6 && i != 7 && i != 8) {
                    Log.d("ProfileInstaller", str);
                    break;
                } else {
                    Log.e("ProfileInstaller", str, (Throwable) serializable);
                    break;
                }
                break;
        }
    }

    @Override // androidx.lifecycle.T
    public Q m(D1.e eVar, C0122c c0122c) {
        return u(AbstractC0078a.F(eVar), c0122c);
    }

    @Override // i0.e
    public void q() {
        switch (this.f1061a) {
            case 24:
                break;
            default:
                Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
                break;
        }
    }

    @Override // androidx.lifecycle.T
    public Q u(Class cls, C0122c c0122c) {
        return g(cls);
    }

    public e(View view, int i) {
        this.f1061a = i;
        switch (i) {
            case 5:
                if (Build.VERSION.SDK_INT < 30) {
                    new e(view, 4);
                    break;
                } else {
                    new O.r(view, 4);
                    break;
                }
        }
    }
}
