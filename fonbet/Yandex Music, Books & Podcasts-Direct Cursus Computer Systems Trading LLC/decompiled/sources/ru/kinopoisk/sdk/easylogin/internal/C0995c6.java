package ru.kinopoisk.sdk.easylogin.internal;

import defpackage.dzf;
import defpackage.nyf;
import defpackage.yn7;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;

/* renamed from: ru.kinopoisk.sdk.easylogin.internal.c6, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0995c6 {

    /* renamed from: ru.kinopoisk.sdk.easylogin.internal.c6$a */
    public static final class a implements yn7 {
        public final /* synthetic */ T7 a;
        public final /* synthetic */ Object b;

        public a(T7 t7, L6 l6) {
            this.a = t7;
            this.b = l6;
        }

        @Override // defpackage.yn7
        public void onCreate(@NotNull dzf dzfVar) {
            dzfVar.getClass();
        }

        @Override // defpackage.yn7
        public void onDestroy(@NotNull dzf dzfVar) {
            dzfVar.getClass();
        }

        @Override // defpackage.yn7
        public final void onPause(dzf dzfVar) {
            dzfVar.getClass();
            T7 t7 = this.a;
            t7.getClass();
            new X7(t7);
            t7.h = null;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, ru.kinopoisk.sdk.easylogin.internal.L6] */
        @Override // defpackage.yn7
        public final void onResume(dzf dzfVar) {
            dzfVar.getClass();
            T7 t7 = this.a;
            K6 navigator = this.b.getNavigator();
            if (navigator != null) {
                t7.g.a(EnumC1051g6.b, new W7(t7, navigator));
                navigator.addNavigationStateHolder(t7);
                Iterator it = t7.d.iterator();
                while (it.hasNext()) {
                    t7.a(navigator, (Z0[]) it.next());
                }
                t7.d.clear();
            } else {
                t7.getClass();
                new X7(t7);
            }
            t7.h = navigator;
        }

        @Override // defpackage.yn7
        public void onStart(@NotNull dzf dzfVar) {
            dzfVar.getClass();
        }

        @Override // defpackage.yn7
        public void onStop(@NotNull dzf dzfVar) {
            dzfVar.getClass();
        }
    }

    public static final void a(@NotNull T7 t7, @NotNull L6 l6, @NotNull nyf nyfVar) {
        t7.getClass();
        l6.getClass();
        nyfVar.getClass();
        nyfVar.a(new a(t7, l6));
    }
}
