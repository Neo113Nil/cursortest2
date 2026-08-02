package ru.kinopoisk.sdk.easylogin.internal;

import android.content.SharedPreferences;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.arf;
import defpackage.btf;
import defpackage.bwf;
import defpackage.ek6;
import defpackage.tuw;
import defpackage.u7e;
import defpackage.uif;
import defpackage.zc4;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class M0 implements L0 {

    @NotNull
    public final tuw a;

    @NotNull
    public final arf b;

    public static final class a extends uif implements Function1<ek6, Boolean> {
        public static final /* synthetic */ int a = 0;

        static {
            new a();
        }

        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            ((ek6) obj).getClass();
            return Boolean.TRUE;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lru/kinopoisk/sdk/easylogin/internal/M0$b;", "", "libs_android_network_cookiejar"}, k = 1, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
    public static final class b {
        public b(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public static final class c extends uif implements Function1<ek6, Boolean> {
        public final /* synthetic */ u7e a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(u7e u7eVar) {
            super(1);
            this.a = u7eVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            boolean y;
            ek6 ek6Var = (ek6) obj;
            ek6Var.getClass();
            u7e u7eVar = this.a;
            String str = ek6Var.d;
            u7eVar.getClass();
            String str2 = u7eVar.d;
            if (ek6Var.i) {
                y = Intrinsics.d(str2, str);
            } else {
                Pattern pattern = ek6.j;
                y = zc4.y(str2, str);
            }
            boolean z = false;
            if (y) {
                String str3 = ek6Var.e;
                String b = u7eVar.b();
                if ((b.equals(str3) || (kotlin.text.c.v(b, str3, false) && (kotlin.text.c.n(str3, "/", false) || b.charAt(str3.length()) == '/'))) && (!ek6Var.f || u7eVar.j)) {
                    z = true;
                }
            }
            return Boolean.valueOf(z);
        }
    }

    static {
        new b(null);
        int i = a.a;
    }

    public M0(@NotNull tuw tuwVar, @NotNull K2 k2) {
        tuwVar.getClass();
        k2.getClass();
        this.a = tuwVar;
        this.b = btf.a(bwf.c, new N0(this));
    }

    @Override // ru.kinopoisk.sdk.easylogin.internal.L0, defpackage.fk6
    @NotNull
    public final List<ek6> loadForRequest(@NotNull u7e u7eVar) {
        ArrayList arrayList;
        u7eVar.getClass();
        c cVar = new c(u7eVar);
        synchronized (this) {
            try {
                arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                long currentTimeMillis = System.currentTimeMillis();
                Iterator it = ((Set) this.b.getValue()).iterator();
                while (it.hasNext()) {
                    ek6 ek6Var = ((O4) it.next()).a;
                    if (ek6Var.c < currentTimeMillis) {
                        arrayList2.add(ek6Var);
                        it.remove();
                    } else if (((Boolean) cVar.invoke(ek6Var)).booleanValue()) {
                        arrayList.add(ek6Var);
                    }
                }
                tuw tuwVar = this.a;
                tuwVar.getClass();
                SharedPreferences.Editor edit = tuwVar.a.edit();
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    edit.remove(tuw.a((ek6) it2.next()));
                }
                edit.apply();
            } catch (Throwable th) {
                throw th;
            }
        }
        return arrayList;
    }

    @Override // ru.kinopoisk.sdk.easylogin.internal.L0, defpackage.fk6
    public final void saveFromResponse(@NotNull u7e u7eVar, @NotNull List<ek6> list) {
        u7eVar.getClass();
        list.getClass();
        synchronized (this) {
            try {
                Set set = (Set) this.b.getValue();
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    set.add(new O4((ek6) it.next()));
                }
                this.a.b(list);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
