package com.yandex.passport.internal.ui.domik.common;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.TextView;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.yandex.passport.R;
import com.yandex.passport.internal.ui.domik.base.b;
import com.yandex.passport.internal.ui.domik.e;
import com.yandex.passport.internal.ui.util.o;
import defpackage.xal;
import io.requery.android.database.sqlite.SQLiteDatabase;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b!\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0004*\u00020\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/yandex/passport/internal/ui/domik/common/i;", "Lcom/yandex/passport/internal/ui/domik/base/b;", "V", "Lcom/yandex/passport/internal/ui/domik/e;", "T", "Lcom/yandex/passport/internal/ui/domik/base/a;", "<init>", "()V", "passport_release"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes4.dex */
public abstract class i<V extends com.yandex.passport.internal.ui.domik.base.b, T extends com.yandex.passport.internal.ui.domik.e> extends com.yandex.passport.internal.ui.domik.base.a<V, T> {
    public EditText t;
    public EditText u;
    public TextView v;
    public TextView w;

    @Override // com.yandex.passport.internal.ui.domik.base.a
    public final void G() {
        TextView textView = this.v;
        if (textView == null) {
            Intrinsics.j("textErrorFirstName");
            throw null;
        }
        textView.setVisibility(8);
        TextView textView2 = this.w;
        if (textView2 != null) {
            textView2.setVisibility(8);
        } else {
            Intrinsics.j("textErrorLastName");
            throw null;
        }
    }

    @Override // com.yandex.passport.internal.ui.domik.base.a
    public final boolean H(String str) {
        str.getClass();
        return "first_name.empty".equals(str) || "last_name.empty".equals(str);
    }

    @Override // com.yandex.passport.internal.ui.domik.base.a
    public final void K(com.yandex.passport.internal.ui.e eVar, String str) {
        TextView textView;
        eVar.getClass();
        str.getClass();
        if (kotlin.text.c.v(str, "first_name", false)) {
            textView = this.v;
            if (textView == null) {
                Intrinsics.j("textErrorFirstName");
                throw null;
            }
        } else {
            textView = this.w;
            if (textView == null) {
                Intrinsics.j("textErrorLastName");
                throw null;
            }
        }
        textView.setText(eVar.b(str));
        textView.setVisibility(0);
        TextView textView2 = this.k;
        if (textView2 != null) {
            textView2.performAccessibilityAction(64, null);
        }
        if (textView2 != null) {
            textView2.sendAccessibilityEvent(SQLiteDatabase.OPEN_NOMUTEX);
        }
        ScrollView scrollView = this.n;
        if (scrollView != null) {
            scrollView.post(new com.yandex.passport.internal.interaction.c(7, this, textView));
        }
    }

    public final EditText L() {
        EditText editText = this.t;
        if (editText != null) {
            return editText;
        }
        Intrinsics.j("editFirstName");
        throw null;
    }

    public final EditText M() {
        EditText editText = this.u;
        if (editText != null) {
            return editText;
        }
        Intrinsics.j("editLastName");
        throw null;
    }

    public abstract void N(String str, String str2);

    public final void O() {
        this.q.d();
        String obj = L().getText().toString();
        int length = obj.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean z2 = Intrinsics.e(obj.charAt(!z ? i : length), 32) <= 0;
            if (z) {
                if (!z2) {
                    break;
                } else {
                    length--;
                }
            } else if (z2) {
                i++;
            } else {
                z = true;
            }
        }
        String obj2 = obj.subSequence(i, length + 1).toString();
        String obj3 = M().getText().toString();
        int length2 = obj3.length() - 1;
        int i2 = 0;
        boolean z3 = false;
        while (i2 <= length2) {
            boolean z4 = Intrinsics.e(obj3.charAt(!z3 ? i2 : length2), 32) <= 0;
            if (z3) {
                if (!z4) {
                    break;
                } else {
                    length2--;
                }
            } else if (z4) {
                i2++;
            } else {
                z3 = true;
            }
        }
        String obj4 = obj3.subSequence(i2, length2 + 1).toString();
        if (TextUtils.isEmpty(obj2)) {
            this.g.k.m(new com.yandex.passport.internal.ui.f("first_name.empty"));
        } else if (TextUtils.isEmpty(obj4)) {
            this.g.k.m(new com.yandex.passport.internal.ui.f("last_name.empty"));
        } else {
            this.q.d();
            N(obj2, obj4);
        }
    }

    @Override // com.yandex.passport.internal.ui.domik.base.a, com.yandex.passport.internal.ui.base.d, androidx.fragment.app.o
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.q = com.yandex.passport.internal.di.a.a().getStatefulReporter();
    }

    @Override // androidx.fragment.app.o
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return layoutInflater.inflate(E().getDomikDesignProvider().e, viewGroup, false);
    }

    @Override // androidx.fragment.app.o
    public final void onResume() {
        super.onResume();
        Editable text = M().getText();
        text.getClass();
        if (text.length() > 0) {
            com.yandex.passport.internal.ui.base.d.B(M(), this.l);
        } else {
            com.yandex.passport.internal.ui.base.d.B(L(), this.l);
        }
    }

    @Override // com.yandex.passport.internal.ui.domik.base.a, com.yandex.passport.internal.ui.base.d, androidx.fragment.app.o
    public void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        View findViewById = view.findViewById(R.id.text_error_first_name);
        findViewById.getClass();
        this.v = (TextView) findViewById;
        View findViewById2 = view.findViewById(R.id.text_error_last_name);
        findViewById2.getClass();
        this.w = (TextView) findViewById2;
        super.onViewCreated(view, bundle);
        View findViewById3 = view.findViewById(R.id.edit_first_name);
        findViewById3.getClass();
        this.t = (EditText) findViewById3;
        View findViewById4 = view.findViewById(R.id.edit_last_name);
        findViewById4.getClass();
        this.u = (EditText) findViewById4;
        this.j.setOnClickListener(new xal(19, this));
        final int i = 0;
        L().addTextChangedListener(new o(new com.yandex.passport.legacy.lx.a(this) { // from class: com.yandex.passport.internal.ui.domik.common.h
            public final /* synthetic */ i b;

            {
                this.b = this;
            }

            @Override // com.yandex.passport.legacy.lx.a
            /* renamed from: b */
            public final void mo1b(Object obj) {
                switch (i) {
                    case 0:
                        this.b.G();
                        break;
                    default:
                        this.b.G();
                        break;
                }
            }
        }));
        final int i2 = 1;
        M().addTextChangedListener(new o(new com.yandex.passport.legacy.lx.a(this) { // from class: com.yandex.passport.internal.ui.domik.common.h
            public final /* synthetic */ i b;

            {
                this.b = this;
            }

            @Override // com.yandex.passport.legacy.lx.a
            /* renamed from: b */
            public final void mo1b(Object obj) {
                switch (i2) {
                    case 0:
                        this.b.G();
                        break;
                    default:
                        this.b.G();
                        break;
                }
            }
        }));
        G();
    }
}
