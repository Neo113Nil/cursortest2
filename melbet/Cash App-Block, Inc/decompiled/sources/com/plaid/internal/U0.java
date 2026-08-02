package com.plaid.internal;

import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.datastore.core.SimpleActor;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider$Factory;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.viewbinding.ViewBindings;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.plaid.internal.N2;
import com.plaid.internal.V0;
import com.plaid.link.R;
import com.squareup.cash.work.webview.views.WorkWebViewDownloadHandler$CookieProvider$Companion$$ExternalSyntheticLambda0;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/plaid/internal/U0;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class U0 extends Fragment {
    public static final /* synthetic */ int c = 0;
    public C0239n5 a;
    public V0 b;

    public static final class a {
        public static U0 a(N2.i iVar) {
            iVar.getClass();
            U0 u0 = new U0();
            Bundle bundle = new Bundle();
            bundle.putParcelable("error_state", iVar);
            u0.setArguments(bundle);
            return u0;
        }
    }

    public static final WindowInsetsCompat a(View view, WindowInsetsCompat windowInsetsCompat) {
        view.getClass();
        windowInsetsCompat.getClass();
        Insets insets = windowInsetsCompat.mImpl.getInsets(519);
        insets.getClass();
        view.setPadding(insets.left, insets.top, insets.right, insets.bottom);
        return WindowInsetsCompat.CONSUMED;
    }

    public static final void b(U0 u0, View view) {
        u0.getClass();
        u0.requireActivity().onBackPressed();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        b bVar = new b();
        ViewModelStore viewModelStore = getViewModelStore();
        CreationExtras defaultViewModelCreationExtras = getDefaultViewModelCreationExtras();
        viewModelStore.getClass();
        defaultViewModelCreationExtras.getClass();
        SimpleActor simpleActor = new SimpleActor(viewModelStore, bVar, defaultViewModelCreationExtras);
        KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(V0.class);
        String qualifiedName = orCreateKotlinClass.getQualifiedName();
        if (qualifiedName != null) {
            this.b = (V0) simpleActor.getViewModel$lifecycle_viewmodel("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(qualifiedName), orCreateKotlinClass);
        } else {
            a$$ExternalSyntheticBUOutline0.m$3("Local and anonymous classes can not be ViewModels");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        View inflate = layoutInflater.inflate(R.layout.plaid_error_fragment, viewGroup, false);
        int i = R.id.error_content;
        TextView textView = (TextView) ViewBindings.findChildViewById(inflate, i);
        if (textView != null) {
            i = R.id.error_header;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(inflate, i);
            if (textView2 != null) {
                i = R.id.error_image;
                if (((ImageView) ViewBindings.findChildViewById(inflate, i)) != null) {
                    i = R.id.exit_button;
                    AppCompatButton appCompatButton = (AppCompatButton) ViewBindings.findChildViewById(inflate, i);
                    if (appCompatButton != null) {
                        i = R.id.plaid_close_icon;
                        if (((ImageView) ViewBindings.findChildViewById(inflate, i)) != null) {
                            LinearLayout linearLayout = (LinearLayout) inflate;
                            i = R.id.plaid_navigation;
                            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(inflate, i);
                            if (linearLayout2 != null) {
                                this.a = new C0239n5(linearLayout, textView, textView2, appCompatButton, linearLayout, linearLayout2);
                                WorkWebViewDownloadHandler$CookieProvider$Companion$$ExternalSyntheticLambda0 workWebViewDownloadHandler$CookieProvider$Companion$$ExternalSyntheticLambda0 = new WorkWebViewDownloadHandler$CookieProvider$Companion$$ExternalSyntheticLambda0(5);
                                WeakHashMap weakHashMap = ViewCompat.sViewPropertyAnimatorMap;
                                ViewCompat.Api21Impl.setOnApplyWindowInsetsListener(linearLayout, workWebViewDownloadHandler$CookieProvider$Companion$$ExternalSyntheticLambda0);
                                C0239n5 c0239n5 = this.a;
                                if (c0239n5 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                                    throw null;
                                }
                                LinearLayout linearLayout3 = c0239n5.a;
                                linearLayout3.getClass();
                                return linearLayout3;
                            }
                        }
                    }
                }
            }
        }
        a$$ExternalSyntheticBUOutline0.m$2("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        N2.i iVar;
        V0.a aVar;
        view.getClass();
        super.onViewCreated(view, bundle);
        C0239n5 c0239n5 = this.a;
        if (c0239n5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            throw null;
        }
        final int i = 0;
        c0239n5.e.findViewById(R.id.plaid_close_icon).setOnClickListener(new View.OnClickListener(this) { // from class: com.plaid.internal.U0$$ExternalSyntheticLambda0
            public final /* synthetic */ U0 f$0;

            {
                this.f$0 = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i2 = i;
                U0 u0 = this.f$0;
                switch (i2) {
                    case 0:
                        U0.a(u0, view2);
                        break;
                    default:
                        U0.b(u0, view2);
                        break;
                }
            }
        });
        C0239n5 c0239n52 = this.a;
        if (c0239n52 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            throw null;
        }
        final int i2 = 1;
        c0239n52.d.setOnClickListener(new View.OnClickListener(this) { // from class: com.plaid.internal.U0$$ExternalSyntheticLambda0
            public final /* synthetic */ U0 f$0;

            {
                this.f$0 = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i22 = i2;
                U0 u0 = this.f$0;
                switch (i22) {
                    case 0:
                        U0.a(u0, view2);
                        break;
                    default:
                        U0.b(u0, view2);
                        break;
                }
            }
        });
        Bundle arguments = getArguments();
        if (arguments == null || (iVar = (N2.i) arguments.getParcelable("error_state")) == null) {
            Log.e("ErrorFragment", "No error state provided, using default UNKNOWN_ERROR state");
            r8.CREATOR.getClass();
            iVar = new N2.i("", r8.e, "", "", "", EmptyList.INSTANCE, "", H3.UNKNOWN_ERROR);
        }
        V0 v0 = this.b;
        if (v0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            throw null;
        }
        int i3 = V0.b.a[iVar.i.ordinal()];
        if (i3 == 1) {
            String string2 = v0.a.getString(R.string.plaid_error_no_network_connection_title);
            string2.getClass();
            String string3 = v0.a.getString(R.string.plaid_error_no_network_connection_content);
            string3.getClass();
            String string4 = v0.a.getString(R.string.plaid_error_no_network_connection_exit);
            string4.getClass();
            aVar = new V0.a(string2, string3, string4);
        } else if (i3 == 2) {
            String string5 = v0.a.getString(R.string.plaid_error_session_expired_title);
            string5.getClass();
            String string6 = v0.a.getString(R.string.plaid_error_session_expired_content);
            string6.getClass();
            String string7 = v0.a.getString(R.string.plaid_error_session_expired_exit);
            string7.getClass();
            aVar = new V0.a(string5, string6, string7);
        } else if (i3 == 3) {
            String string8 = v0.a.getString(R.string.plaid_error_initialization_header);
            string8.getClass();
            String string9 = v0.a.getString(R.string.plaid_error_initialization_content);
            string9.getClass();
            String string10 = v0.a.getString(R.string.plaid_error_initialization_button_text);
            string10.getClass();
            aVar = new V0.a(string8, string9, string10);
        } else if (i3 == 4) {
            String string11 = v0.a.getString(R.string.plaid_error_internal_server_error_something_went_wrong);
            string11.getClass();
            String string12 = v0.a.getString(R.string.plaid_error_internal_server_error_try_again_later);
            string12.getClass();
            String string13 = v0.a.getString(R.string.plaid_error_internal_error_exit);
            string13.getClass();
            aVar = new V0.a(string11, string12, string13);
        } else {
            if (i3 != 5) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return;
            }
            String string14 = v0.a.getString(R.string.plaid_error_fallback_header);
            string14.getClass();
            String string15 = v0.a.getString(R.string.plaid_error_fallback_content);
            string15.getClass();
            String string16 = v0.a.getString(R.string.plaid_error_fallback_button_text);
            string16.getClass();
            aVar = new V0.a(string14, string15, string16);
        }
        C0239n5 c0239n53 = this.a;
        if (c0239n53 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            throw null;
        }
        c0239n53.c.setText(aVar.a);
        C0239n5 c0239n54 = this.a;
        if (c0239n54 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            throw null;
        }
        c0239n54.b.setText(aVar.b);
        C0239n5 c0239n55 = this.a;
        if (c0239n55 != null) {
            c0239n55.d.setText(aVar.c);
        } else {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            throw null;
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements ViewModelProvider$Factory {
        public b() {
        }

        @Override // androidx.lifecycle.ViewModelProvider$Factory
        public final <T extends ViewModel> T create(Class<T> cls) {
            cls.getClass();
            Resources resources = U0.this.getResources();
            resources.getClass();
            return new V0(resources);
        }

        @Override // androidx.lifecycle.ViewModelProvider$Factory
        public /* bridge */ /* synthetic */ ViewModel create(KClass kClass, CreationExtras creationExtras) {
            return super.create(kClass, creationExtras);
        }

        @Override // androidx.lifecycle.ViewModelProvider$Factory
        public /* bridge */ /* synthetic */ ViewModel create(Class cls, CreationExtras creationExtras) {
            return super.create(cls, creationExtras);
        }
    }

    public static final void a(U0 u0, View view) {
        u0.getClass();
        u0.requireActivity().onBackPressed();
    }
}
