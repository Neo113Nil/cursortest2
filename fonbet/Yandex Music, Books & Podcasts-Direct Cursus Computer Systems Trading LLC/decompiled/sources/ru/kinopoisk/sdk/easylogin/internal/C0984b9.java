package ru.kinopoisk.sdk.easylogin.internal;

import android.content.Context;
import defpackage.arf;
import defpackage.btf;
import defpackage.r7o;
import defpackage.t7o;
import defpackage.uif;
import defpackage.z7o;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import timber.log.Timber;

/* renamed from: ru.kinopoisk.sdk.easylogin.internal.b9, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0984b9 {

    @NotNull
    public static final C0984b9 a = new C0984b9();

    @NotNull
    public static final arf b = btf.b(a.a);

    /* renamed from: ru.kinopoisk.sdk.easylogin.internal.b9$a */
    public static final class a extends uif implements Function0<Class<?>> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            Object t7oVar;
            C0984b9 c0984b9 = C0984b9.a;
            try {
                r7o r7oVar = z7o.b;
                t7oVar = Class.forName("android.os.SystemProperties", true, Context.class.getClassLoader());
            } catch (Throwable th) {
                r7o r7oVar2 = z7o.b;
                t7oVar = new t7o(th);
            }
            if (z7o.a(t7oVar) != null) {
                Timber.INSTANCE.tag("SystemPropertiesHelper").e("Cannot init system property", new Object[0]);
            }
            if (t7oVar instanceof t7o) {
                t7oVar = null;
            }
            return (Class) t7oVar;
        }
    }
}
