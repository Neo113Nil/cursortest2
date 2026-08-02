package com.plaid.internal;

import android.os.Bundle;
import androidx.core.view.KeyEventDispatcher;
import androidx.datastore.core.SimpleActor;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.plaid.internal.u8;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

/* loaded from: classes5.dex */
public abstract class p8<VM extends u8> extends Fragment {
    public static final /* synthetic */ int d = 0;
    public VM b;
    public final Class<VM> a = C0217l1.class;
    public final Lazy c = LazyKt.lazy(new o8(this));

    public static final class a extends Lambda implements Function1<J4, u8> {
        public final /* synthetic */ p8<VM> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(p8<VM> p8Var) {
            super(1);
            this.a = p8Var;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            J4 j4 = (J4) obj;
            j4.getClass();
            p8<VM> p8Var = this.a;
            r8 r8Var = (r8) p8Var.c.getValue();
            r8Var.getClass();
            return p8Var.a(r8Var, j4);
        }
    }

    public abstract C0217l1 a(r8 r8Var, J4 j4);

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        KeyEventDispatcher.Component activity = getActivity();
        activity.getClass();
        v8 a2 = ((w8) activity).a(new a(this));
        a2.getClass();
        ViewModelStore viewModelStore = getViewModelStore();
        CreationExtras defaultViewModelCreationExtras = getDefaultViewModelCreationExtras();
        viewModelStore.getClass();
        defaultViewModelCreationExtras.getClass();
        SimpleActor simpleActor = new SimpleActor(viewModelStore, a2, defaultViewModelCreationExtras);
        Class<VM> cls = this.a;
        cls.getClass();
        KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(cls);
        String qualifiedName = orCreateKotlinClass.getQualifiedName();
        if (qualifiedName != null) {
            this.b = (VM) simpleActor.getViewModel$lifecycle_viewmodel("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(qualifiedName), orCreateKotlinClass);
        } else {
            a$$ExternalSyntheticBUOutline0.m$3("Local and anonymous classes can not be ViewModels");
        }
    }
}
