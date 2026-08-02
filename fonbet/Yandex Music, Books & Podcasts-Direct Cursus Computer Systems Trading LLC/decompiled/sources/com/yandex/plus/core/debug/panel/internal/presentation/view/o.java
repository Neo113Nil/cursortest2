package com.yandex.plus.core.debug.panel.internal.presentation.view;

import android.animation.ObjectAnimator;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.passport.internal.t;
import com.yandex.plus.bdui.flex.factory.p;
import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.r1;
import com.yandex.plus.core.debug.panel.internal.data.PlusSdkFileProvider;
import defpackage.dx3;
import defpackage.ern;
import defpackage.f1d;
import defpackage.fkn;
import defpackage.hac;
import defpackage.jyr;
import defpackage.mm6;
import defpackage.mxt;
import defpackage.o8n;
import defpackage.r0w;
import defpackage.r7o;
import defpackage.s9f;
import defpackage.t7o;
import defpackage.ub7;
import defpackage.v75;
import defpackage.xal;
import defpackage.xdr;
import defpackage.yxm;
import defpackage.z7o;
import defpackage.zch;
import defpackage.zne;
import defpackage.zsd;
import java.io.File;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import ru.yandex.music.R;

/* loaded from: classes4.dex */
public final class o extends LinearLayoutCompat {
    public static final /* synthetic */ s9f[] I = {new yxm(o.class, "logsRecyclerView", "getLogsRecyclerView()Landroidx/recyclerview/widget/RecyclerView;", 0), f1d.c(ern.a, o.class, "backToInfoImageButton", "getBackToInfoImageButton()Landroid/widget/ImageButton;", 0), new yxm(o.class, "backToInfoTextView", "getBackToInfoTextView()Landroid/widget/TextView;", 0), new yxm(o.class, "titleLogsTextView", "getTitleLogsTextView()Landroid/widget/TextView;", 0), new yxm(o.class, "menuImageButton", "getMenuImageButton()Landroid/widget/ImageButton;", 0), new yxm(o.class, "toSearchImageButton", "getToSearchImageButton()Landroid/widget/ImageButton;", 0), new yxm(o.class, "searchView", "getSearchView()Landroid/view/View;", 0), new yxm(o.class, "searchEditText", "getSearchEditText()Landroid/widget/EditText;", 0), new yxm(o.class, "previousMatchImageButton", "getPreviousMatchImageButton()Landroid/widget/ImageButton;", 0), new yxm(o.class, "nextMatchImageButton", "getNextMatchImageButton()Landroid/widget/ImageButton;", 0), new yxm(o.class, "searchClearImageButton", "getSearchClearImageButton()Landroid/widget/ImageButton;", 0), new yxm(o.class, "closeSearchImageButton", "getCloseSearchImageButton()Landroid/view/View;", 0), new yxm(o.class, "scrollImageButton", "getScrollImageButton()Landroid/widget/ImageButton;", 0)};
    public final com.yandex.plus.bdui.plus.content.controller.f A;
    public final com.yandex.plus.bdui.plus.content.controller.f B;
    public final com.yandex.plus.bdui.plus.content.controller.f C;
    public final com.yandex.plus.bdui.plus.content.controller.f D;
    public final com.yandex.plus.bdui.plus.content.controller.f E;
    public final com.yandex.plus.bdui.plus.content.controller.f F;
    public int G;
    public final mxt H;
    public final com.yandex.plus.core.debug.panel.internal.presentation.controller.c p;
    public final mm6 q;
    public final com.yandex.plus.core.debug.panel.internal.presentation.viewModel.c r;
    public final Function1 s;
    public final com.yandex.plus.bdui.plus.content.controller.f t;
    public final com.yandex.plus.bdui.plus.content.controller.f u;
    public final com.yandex.plus.bdui.plus.content.controller.f v;
    public final com.yandex.plus.bdui.plus.content.controller.f w;
    public final com.yandex.plus.bdui.plus.content.controller.f x;
    public final com.yandex.plus.bdui.plus.content.controller.f y;
    public final com.yandex.plus.bdui.plus.content.controller.f z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(@NotNull Context context, @NotNull com.yandex.plus.core.debug.panel.internal.presentation.controller.c cVar, @NotNull mm6 mm6Var, @NotNull com.yandex.plus.core.debug.panel.internal.presentation.viewModel.c cVar2, @NotNull zne zneVar, @NotNull Function1<? super Boolean, Unit> function1) {
        super(context);
        context.getClass();
        cVar.getClass();
        mm6Var.getClass();
        cVar2.getClass();
        zneVar.getClass();
        function1.getClass();
        this.p = cVar;
        this.q = mm6Var;
        this.r = cVar2;
        this.s = function1;
        this.t = new com.yandex.plus.bdui.plus.content.controller.f(new n(this, 4));
        this.u = new com.yandex.plus.bdui.plus.content.controller.f(new n(this, 5));
        final int i = 6;
        this.v = new com.yandex.plus.bdui.plus.content.controller.f(new n(this, i));
        this.w = new com.yandex.plus.bdui.plus.content.controller.f(new n(this, 7));
        this.x = new com.yandex.plus.bdui.plus.content.controller.f(new n(this, 8));
        this.y = new com.yandex.plus.bdui.plus.content.controller.f(new n(this, 9));
        this.z = new com.yandex.plus.bdui.plus.content.controller.f(new n(this, 10));
        this.A = new com.yandex.plus.bdui.plus.content.controller.f(new n(this, 11));
        int i2 = 12;
        this.B = new com.yandex.plus.bdui.plus.content.controller.f(new n(this, i2));
        final int i3 = 0;
        this.C = new com.yandex.plus.bdui.plus.content.controller.f(new n(this, i3));
        final int i4 = 1;
        this.D = new com.yandex.plus.bdui.plus.content.controller.f(new n(this, i4));
        this.E = new com.yandex.plus.bdui.plus.content.controller.f(new n(this, 2));
        this.F = new com.yandex.plus.bdui.plus.content.controller.f(new n(this, 3));
        this.G = R.drawable.plus_debug_panel_ic_arrow_down;
        mxt mxtVar = new mxt(new com.yandex.plus.core.debug.panel.internal.presentation.controller.a(1, this, o.class, "onItemClicked", "onItemClicked(Ljava/lang/String;)V", 0, 3));
        this.H = mxtVar;
        LayoutInflater.from(context).inflate(R.layout.plus_debug_panel_logs, (ViewGroup) this, true);
        int i5 = zneVar.b;
        int i6 = zneVar.a;
        setPadding(i6, i5, zneVar.c, getPaddingBottom());
        RecyclerView logsRecyclerView = getLogsRecyclerView();
        int i7 = zneVar.d;
        logsRecyclerView.setPadding(logsRecyclerView.getPaddingLeft(), logsRecyclerView.getPaddingTop(), logsRecyclerView.getPaddingRight(), i7);
        r1.Q(i6, i7, 6, getScrollImageButton());
        fkn fknVar = cVar2.q;
        Continuation continuation = null;
        zsd.r0(mm6Var, new ub7(i2, zsd.b0(new t(fknVar, 25)), new m(this, continuation, i3)));
        zsd.r0(mm6Var, new ub7(i2, fknVar, new m(this, continuation, i4)));
        RecyclerView logsRecyclerView2 = getLogsRecyclerView();
        logsRecyclerView2.setPadding(logsRecyclerView2.getPaddingLeft(), logsRecyclerView2.getPaddingTop(), logsRecyclerView2.getPaddingRight(), i7);
        getLogsRecyclerView().setAdapter(mxtVar);
        RecyclerView logsRecyclerView3 = getLogsRecyclerView();
        Context context2 = getContext();
        context2.getClass();
        logsRecyclerView3.s(new o8n(context2));
        final int i8 = 2;
        getLogsRecyclerView().t(new zch(new i(this, i3), new g(this, i8)));
        t(false);
        PopupMenu popupMenu = new PopupMenu(getContext(), getMenuImageButton());
        popupMenu.getMenuInflater().inflate(R.menu.plus_debug_panel_menu_logs, popupMenu.getMenu());
        final int i9 = 4;
        r1.E(getBackToInfoImageButton(), new View.OnClickListener(this) { // from class: com.yandex.plus.core.debug.panel.internal.presentation.view.h
            public final /* synthetic */ o b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i10 = i9;
                o oVar = this.b;
                switch (i10) {
                    case 0:
                        s9f[] s9fVarArr = o.I;
                        oVar.q();
                        oVar.r();
                        oVar.p(true);
                        break;
                    case 1:
                        o.m(oVar);
                        break;
                    case 2:
                        com.yandex.plus.core.debug.panel.internal.presentation.viewModel.c cVar3 = oVar.r;
                        cVar3.d((cVar3.m + 1) % ((List) cVar3.j.getValue()).size());
                        break;
                    case 3:
                        com.yandex.plus.core.debug.panel.internal.presentation.viewModel.c cVar4 = oVar.r;
                        int size = ((List) cVar4.j.getValue()).size();
                        cVar4.d(((cVar4.m + size) - 1) % size);
                        break;
                    case 4:
                        oVar.s.invoke(Boolean.TRUE);
                        break;
                    case 5:
                        s9f[] s9fVarArr2 = o.I;
                        oVar.q();
                        break;
                    case 6:
                        oVar.s.invoke(Boolean.TRUE);
                        break;
                    default:
                        o.k(oVar);
                        break;
                }
            }
        });
        r1.E(getBackToInfoTextView(), new View.OnClickListener(this) { // from class: com.yandex.plus.core.debug.panel.internal.presentation.view.h
            public final /* synthetic */ o b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i10 = i;
                o oVar = this.b;
                switch (i10) {
                    case 0:
                        s9f[] s9fVarArr = o.I;
                        oVar.q();
                        oVar.r();
                        oVar.p(true);
                        break;
                    case 1:
                        o.m(oVar);
                        break;
                    case 2:
                        com.yandex.plus.core.debug.panel.internal.presentation.viewModel.c cVar3 = oVar.r;
                        cVar3.d((cVar3.m + 1) % ((List) cVar3.j.getValue()).size());
                        break;
                    case 3:
                        com.yandex.plus.core.debug.panel.internal.presentation.viewModel.c cVar4 = oVar.r;
                        int size = ((List) cVar4.j.getValue()).size();
                        cVar4.d(((cVar4.m + size) - 1) % size);
                        break;
                    case 4:
                        oVar.s.invoke(Boolean.TRUE);
                        break;
                    case 5:
                        s9f[] s9fVarArr2 = o.I;
                        oVar.q();
                        break;
                    case 6:
                        oVar.s.invoke(Boolean.TRUE);
                        break;
                    default:
                        o.k(oVar);
                        break;
                }
            }
        });
        r1.E(getMenuImageButton(), new xal(24, popupMenu));
        final int i10 = 7;
        r1.E(getToSearchImageButton(), new View.OnClickListener(this) { // from class: com.yandex.plus.core.debug.panel.internal.presentation.view.h
            public final /* synthetic */ o b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i102 = i10;
                o oVar = this.b;
                switch (i102) {
                    case 0:
                        s9f[] s9fVarArr = o.I;
                        oVar.q();
                        oVar.r();
                        oVar.p(true);
                        break;
                    case 1:
                        o.m(oVar);
                        break;
                    case 2:
                        com.yandex.plus.core.debug.panel.internal.presentation.viewModel.c cVar3 = oVar.r;
                        cVar3.d((cVar3.m + 1) % ((List) cVar3.j.getValue()).size());
                        break;
                    case 3:
                        com.yandex.plus.core.debug.panel.internal.presentation.viewModel.c cVar4 = oVar.r;
                        int size = ((List) cVar4.j.getValue()).size();
                        cVar4.d(((cVar4.m + size) - 1) % size);
                        break;
                    case 4:
                        oVar.s.invoke(Boolean.TRUE);
                        break;
                    case 5:
                        s9f[] s9fVarArr2 = o.I;
                        oVar.q();
                        break;
                    case 6:
                        oVar.s.invoke(Boolean.TRUE);
                        break;
                    default:
                        o.k(oVar);
                        break;
                }
            }
        });
        r1.E(getCloseSearchImageButton(), new View.OnClickListener(this) { // from class: com.yandex.plus.core.debug.panel.internal.presentation.view.h
            public final /* synthetic */ o b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i102 = i3;
                o oVar = this.b;
                switch (i102) {
                    case 0:
                        s9f[] s9fVarArr = o.I;
                        oVar.q();
                        oVar.r();
                        oVar.p(true);
                        break;
                    case 1:
                        o.m(oVar);
                        break;
                    case 2:
                        com.yandex.plus.core.debug.panel.internal.presentation.viewModel.c cVar3 = oVar.r;
                        cVar3.d((cVar3.m + 1) % ((List) cVar3.j.getValue()).size());
                        break;
                    case 3:
                        com.yandex.plus.core.debug.panel.internal.presentation.viewModel.c cVar4 = oVar.r;
                        int size = ((List) cVar4.j.getValue()).size();
                        cVar4.d(((cVar4.m + size) - 1) % size);
                        break;
                    case 4:
                        oVar.s.invoke(Boolean.TRUE);
                        break;
                    case 5:
                        s9f[] s9fVarArr2 = o.I;
                        oVar.q();
                        break;
                    case 6:
                        oVar.s.invoke(Boolean.TRUE);
                        break;
                    default:
                        o.k(oVar);
                        break;
                }
            }
        });
        r1.E(getScrollImageButton(), new View.OnClickListener(this) { // from class: com.yandex.plus.core.debug.panel.internal.presentation.view.h
            public final /* synthetic */ o b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i102 = i4;
                o oVar = this.b;
                switch (i102) {
                    case 0:
                        s9f[] s9fVarArr = o.I;
                        oVar.q();
                        oVar.r();
                        oVar.p(true);
                        break;
                    case 1:
                        o.m(oVar);
                        break;
                    case 2:
                        com.yandex.plus.core.debug.panel.internal.presentation.viewModel.c cVar3 = oVar.r;
                        cVar3.d((cVar3.m + 1) % ((List) cVar3.j.getValue()).size());
                        break;
                    case 3:
                        com.yandex.plus.core.debug.panel.internal.presentation.viewModel.c cVar4 = oVar.r;
                        int size = ((List) cVar4.j.getValue()).size();
                        cVar4.d(((cVar4.m + size) - 1) % size);
                        break;
                    case 4:
                        oVar.s.invoke(Boolean.TRUE);
                        break;
                    case 5:
                        s9f[] s9fVarArr2 = o.I;
                        oVar.q();
                        break;
                    case 6:
                        oVar.s.invoke(Boolean.TRUE);
                        break;
                    default:
                        o.k(oVar);
                        break;
                }
            }
        });
        EditText searchEditText = getSearchEditText();
        g gVar = new g(this, i4);
        searchEditText.getClass();
        searchEditText.addTextChangedListener(new com.yandex.plus.core.debug.panel.internal.utils.ext.a(searchEditText, gVar));
        getSearchEditText().setOnEditorActionListener(new dx3(this, 6));
        r1.E(getNextMatchImageButton(), new View.OnClickListener(this) { // from class: com.yandex.plus.core.debug.panel.internal.presentation.view.h
            public final /* synthetic */ o b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i102 = i8;
                o oVar = this.b;
                switch (i102) {
                    case 0:
                        s9f[] s9fVarArr = o.I;
                        oVar.q();
                        oVar.r();
                        oVar.p(true);
                        break;
                    case 1:
                        o.m(oVar);
                        break;
                    case 2:
                        com.yandex.plus.core.debug.panel.internal.presentation.viewModel.c cVar3 = oVar.r;
                        cVar3.d((cVar3.m + 1) % ((List) cVar3.j.getValue()).size());
                        break;
                    case 3:
                        com.yandex.plus.core.debug.panel.internal.presentation.viewModel.c cVar4 = oVar.r;
                        int size = ((List) cVar4.j.getValue()).size();
                        cVar4.d(((cVar4.m + size) - 1) % size);
                        break;
                    case 4:
                        oVar.s.invoke(Boolean.TRUE);
                        break;
                    case 5:
                        s9f[] s9fVarArr2 = o.I;
                        oVar.q();
                        break;
                    case 6:
                        oVar.s.invoke(Boolean.TRUE);
                        break;
                    default:
                        o.k(oVar);
                        break;
                }
            }
        });
        final int i11 = 3;
        r1.E(getPreviousMatchImageButton(), new View.OnClickListener(this) { // from class: com.yandex.plus.core.debug.panel.internal.presentation.view.h
            public final /* synthetic */ o b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i102 = i11;
                o oVar = this.b;
                switch (i102) {
                    case 0:
                        s9f[] s9fVarArr = o.I;
                        oVar.q();
                        oVar.r();
                        oVar.p(true);
                        break;
                    case 1:
                        o.m(oVar);
                        break;
                    case 2:
                        com.yandex.plus.core.debug.panel.internal.presentation.viewModel.c cVar3 = oVar.r;
                        cVar3.d((cVar3.m + 1) % ((List) cVar3.j.getValue()).size());
                        break;
                    case 3:
                        com.yandex.plus.core.debug.panel.internal.presentation.viewModel.c cVar4 = oVar.r;
                        int size = ((List) cVar4.j.getValue()).size();
                        cVar4.d(((cVar4.m + size) - 1) % size);
                        break;
                    case 4:
                        oVar.s.invoke(Boolean.TRUE);
                        break;
                    case 5:
                        s9f[] s9fVarArr2 = o.I;
                        oVar.q();
                        break;
                    case 6:
                        oVar.s.invoke(Boolean.TRUE);
                        break;
                    default:
                        o.k(oVar);
                        break;
                }
            }
        });
        final int i12 = 5;
        r1.E(getSearchClearImageButton(), new View.OnClickListener(this) { // from class: com.yandex.plus.core.debug.panel.internal.presentation.view.h
            public final /* synthetic */ o b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i102 = i12;
                o oVar = this.b;
                switch (i102) {
                    case 0:
                        s9f[] s9fVarArr = o.I;
                        oVar.q();
                        oVar.r();
                        oVar.p(true);
                        break;
                    case 1:
                        o.m(oVar);
                        break;
                    case 2:
                        com.yandex.plus.core.debug.panel.internal.presentation.viewModel.c cVar3 = oVar.r;
                        cVar3.d((cVar3.m + 1) % ((List) cVar3.j.getValue()).size());
                        break;
                    case 3:
                        com.yandex.plus.core.debug.panel.internal.presentation.viewModel.c cVar4 = oVar.r;
                        int size = ((List) cVar4.j.getValue()).size();
                        cVar4.d(((cVar4.m + size) - 1) % size);
                        break;
                    case 4:
                        oVar.s.invoke(Boolean.TRUE);
                        break;
                    case 5:
                        s9f[] s9fVarArr2 = o.I;
                        oVar.q();
                        break;
                    case 6:
                        oVar.s.invoke(Boolean.TRUE);
                        break;
                    default:
                        o.k(oVar);
                        break;
                }
            }
        });
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() { // from class: com.yandex.plus.core.debug.panel.internal.presentation.view.j
            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.widget.PopupMenu.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                t7o t7oVar;
                Object t7oVar2;
                com.yandex.plus.core.debug.panel.internal.presentation.viewModel.c cVar3 = o.this.r;
                s9f[] s9fVarArr = o.I;
                int itemId = menuItem.getItemId();
                if (itemId == R.id.plus_sdk_menu_fields) {
                    xdr xdrVar = cVar3.p;
                    com.yandex.plus.core.debug.panel.internal.model.log.b bVar = new com.yandex.plus.core.debug.panel.internal.model.log.b((List) cVar3.o.getValue());
                    xdrVar.getClass();
                    xdrVar.m(null, bVar);
                    return true;
                }
                if (itemId == R.id.plus_sdk_menu_levels) {
                    xdr xdrVar2 = cVar3.p;
                    com.yandex.plus.core.debug.panel.internal.model.log.c cVar4 = new com.yandex.plus.core.debug.panel.internal.model.log.c((List) cVar3.n.getValue());
                    xdrVar2.getClass();
                    xdrVar2.m(null, cVar4);
                    return true;
                }
                if (itemId != R.id.plus_sdk_menu_send) {
                    if (itemId != R.id.plus_sdk_menu_clear) {
                        return false;
                    }
                    cVar3.g.invoke();
                    cVar3.c();
                    return true;
                }
                com.yandex.plus.core.debug.panel.api.a aVar = cVar3.f;
                com.yandex.plus.bdui.plus.content.controller.f fVar = cVar3.c;
                List list = (List) cVar3.i.getValue();
                fVar.getClass();
                list.getClass();
                String X = CollectionsKt.X(list, "\n\n\n", null, null, new com.yandex.plus.bdui.plus.webview.navigation.a(3), 30);
                com.yandex.passport.internal.core.accounts.h hVar = (com.yandex.passport.internal.core.accounts.h) aVar;
                Context context3 = (Context) hVar.b;
                String format = String.format((String) hVar.c, Arrays.copyOf(new Object[]{((SimpleDateFormat) ((jyr) hVar.d).getValue()).format(new Date())}, 1));
                try {
                    r7o r7oVar = z7o.b;
                    File file = new File((File) hVar.e, format);
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    try {
                        byte[] bytes = X.getBytes(Charsets.UTF_8);
                        bytes.getClass();
                        fileOutputStream.write(bytes);
                        fileOutputStream.flush();
                        fileOutputStream.close();
                        t7oVar = file;
                    } finally {
                    }
                } catch (Throwable th) {
                    r7o r7oVar2 = z7o.b;
                    t7oVar = new t7o(th);
                }
                Throwable a = z7o.a(t7oVar);
                if (a != null) {
                    Toast.makeText(context3, "createFile() exception=" + a.getMessage(), 0).show();
                }
                boolean z = t7oVar instanceof t7o;
                Object obj = t7oVar;
                if (z) {
                    obj = null;
                }
                File file2 = (File) obj;
                if (file2 != null) {
                    try {
                        int i13 = PlusSdkFileProvider.g;
                        t7oVar2 = hac.d(context3, String.format("%s.PlusSdkFileProvider", Arrays.copyOf(new Object[]{context3.getPackageName()}, 1)), file2);
                    } catch (Throwable th2) {
                        r7o r7oVar3 = z7o.b;
                        t7oVar2 = new t7o(th2);
                    }
                    Throwable a2 = z7o.a(t7oVar2);
                    if (a2 != null) {
                        Toast.makeText(context3, "getUriForFile() exception=" + a2.getMessage(), 0).show();
                    }
                    if (t7oVar2 instanceof t7o) {
                        t7oVar2 = null;
                    }
                    Uri uri = (Uri) t7oVar2;
                    if (uri != null) {
                        Intent intent = new Intent("android.intent.action.SEND");
                        intent.putExtra("android.intent.extra.STREAM", uri);
                        intent.setType("text/plain");
                        intent.setFlags(1);
                        intent.setClipData(ClipData.newRawUri(format, uri));
                        Intent createChooser = Intent.createChooser(intent, null);
                        createChooser.addFlags(268435456);
                        context3.startActivity(createChooser);
                    }
                }
                return true;
            }
        });
    }

    private final ImageButton getBackToInfoImageButton() {
        return (ImageButton) this.u.g(I[1]);
    }

    private final TextView getBackToInfoTextView() {
        return (TextView) this.v.g(I[2]);
    }

    private final View getCloseSearchImageButton() {
        return (View) this.E.g(I[11]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RecyclerView getLogsRecyclerView() {
        return (RecyclerView) this.t.g(I[0]);
    }

    private final ImageButton getMenuImageButton() {
        return (ImageButton) this.x.g(I[4]);
    }

    private final ImageButton getNextMatchImageButton() {
        return (ImageButton) this.C.g(I[9]);
    }

    private final ImageButton getPreviousMatchImageButton() {
        return (ImageButton) this.B.g(I[8]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ImageButton getScrollImageButton() {
        return (ImageButton) this.F.g(I[12]);
    }

    private final ImageButton getSearchClearImageButton() {
        return (ImageButton) this.D.g(I[10]);
    }

    private final EditText getSearchEditText() {
        return (EditText) this.A.g(I[7]);
    }

    private final View getSearchView() {
        return (View) this.z.g(I[6]);
    }

    private final TextView getTitleLogsTextView() {
        return (TextView) this.w.g(I[3]);
    }

    private final ImageButton getToSearchImageButton() {
        return (ImageButton) this.y.g(I[5]);
    }

    public static Unit j(o oVar, int i) {
        oVar.G = i > 0 ? R.drawable.plus_debug_panel_ic_arrow_down : R.drawable.plus_debug_panel_ic_arrow_up;
        oVar.getScrollImageButton().setVisibility(0);
        oVar.getScrollImageButton().setAlpha(1.0f);
        oVar.getScrollImageButton().setImageResource(oVar.G);
        return Unit.a;
    }

    public static void k(o oVar) {
        oVar.p(false);
        oVar.getSearchEditText().requestFocus();
        EditText searchEditText = oVar.getSearchEditText();
        Context context = oVar.getContext();
        context.getClass();
        InputMethodManager inputMethodManager = (InputMethodManager) context.getSystemService(InputMethodManager.class);
        if (inputMethodManager != null) {
            inputMethodManager.showSoftInput(searchEditText, 1);
        }
    }

    public static Unit l(o oVar) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(oVar.getScrollImageButton(), "alpha", 0.0f);
        ofFloat.setDuration(300L);
        ofFloat.setStartDelay(500L);
        ofFloat.addListener(new com.yandex.plus.acquisition.sdk.button.section.ui.impl.utils.a(1, oVar));
        ofFloat.start();
        return Unit.a;
    }

    public static void m(o oVar) {
        if (oVar.G == R.drawable.plus_debug_panel_ic_arrow_down) {
            oVar.getLogsRecyclerView().z0(oVar.H.c() - 1);
        } else {
            oVar.getLogsRecyclerView().z0(0);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        com.yandex.plus.bdui.plus.analytics.b.d(this.q);
    }

    public final void p(boolean z) {
        getBackToInfoImageButton().setVisibility(z ? 0 : 8);
        getBackToInfoTextView().setVisibility(z ? 0 : 8);
        getTitleLogsTextView().setVisibility(z ? 0 : 8);
        getToSearchImageButton().setVisibility(z ? 0 : 8);
        getMenuImageButton().setVisibility(z ? 0 : 8);
        getSearchView().setVisibility(z ? 8 : 0);
    }

    public final void q() {
        this.r.c();
        getSearchEditText().setText("");
    }

    public final void r() {
        Context context = getContext();
        context.getClass();
        InputMethodManager inputMethodManager = (InputMethodManager) context.getSystemService(InputMethodManager.class);
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(getSearchEditText().getWindowToken(), 0);
        }
    }

    public final void s(List list, Function1 function1, Function0 function0) {
        List<com.yandex.plus.core.debug.panel.internal.model.log.e> list2 = list;
        ArrayList arrayList = new ArrayList(v75.o(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(Boolean.valueOf(((com.yandex.plus.core.debug.panel.internal.model.log.e) it.next()).b));
        }
        boolean[] s0 = CollectionsKt.s0(arrayList);
        ArrayList arrayList2 = new ArrayList(v75.o(list2, 10));
        for (com.yandex.plus.core.debug.panel.internal.model.log.e eVar : list2) {
            arrayList2.add(new com.yandex.plus.core.debug.panel.internal.model.ui.e(eVar.a.a, eVar.b));
        }
        r0w r0wVar = new r0w(25, s0);
        com.yandex.plus.bdui.templating.render.a aVar = new com.yandex.plus.bdui.templating.render.a(1, function1, s0);
        i iVar = new i(this, 2);
        d dVar = (d) this.p;
        dVar.getClass();
        dVar.a();
        Context context = dVar.getContext();
        context.getClass();
        c cVar = new c(context, r0wVar, arrayList2, new com.yandex.passport.internal.ui.sloth.ebs.i(8, aVar, iVar, dVar), new p(8, function0, iVar, dVar), new com.yandex.plus.bdui.content.b(9, iVar, dVar));
        dVar.h.push(cVar);
        dVar.addView(cVar);
    }

    public final void t(boolean z) {
        float f = z ? 1.0f : 0.5f;
        getPreviousMatchImageButton().setEnabled(z);
        getPreviousMatchImageButton().setAlpha(f);
        getNextMatchImageButton().setEnabled(z);
        getNextMatchImageButton().setAlpha(f);
    }
}
