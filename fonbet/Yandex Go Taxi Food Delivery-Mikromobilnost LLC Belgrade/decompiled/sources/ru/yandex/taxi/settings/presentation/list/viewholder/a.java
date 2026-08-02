package ru.yandex.taxi.settings.presentation.list.viewholder;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import androidx.core.view.b;
import defpackage.amp0;
import defpackage.czo0;
import defpackage.epo0;
import defpackage.f6r0;
import defpackage.hbp0;
import defpackage.pzt0;
import defpackage.quq0;
import defpackage.rp31;
import defpackage.tls;
import defpackage.tt2;
import defpackage.ul10;
import defpackage.veh0;
import defpackage.vng;
import defpackage.w95;
import defpackage.y5r0;
import defpackage.z5r0;
import java.util.List;
import java.util.WeakHashMap;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.ListItemSwitchComponent;
import ru.yandex.taxi.design.utils.DividerPosition;
import ru.yandex.taxi.design.utils.DividerType;
import ru.yandex.taxi.settings.api.dto.settings.types.MenuItemElementType;
import ru.yandex.taxi.settings.presentation.list.viewholder.a;

/* loaded from: classes6.dex */
public final class a extends w95 {
    public final amp0 N;
    public final ListItemComponent O;
    public final hbp0 P;
    public final tt2 Q;
    public pzt0 R;
    public pzt0 S;

    public a(View view, amp0 amp0Var) {
        super(view);
        this.N = amp0Var;
        int i = veh0.push_setting_item_root;
        WeakHashMap weakHashMap = b.a;
        this.O = (ListItemComponent) ((View) rp31.d(view, i));
        this.P = new hbp0(new czo0(14), "", null);
        this.Q = (tt2) amp0Var.b;
    }

    @Override // defpackage.w95
    public final void W(z5r0 z5r0Var) {
        ListItemComponent listItemComponent;
        String str;
        y5r0 y5r0Var = (y5r0) z5r0Var;
        hbp0 hbp0Var = this.P;
        if (!hbp0Var.d()) {
            hbp0Var.a();
        }
        ul10 ul10Var = y5r0Var.a;
        ul10 ul10Var2 = y5r0Var.f;
        ul10 ul10Var3 = y5r0Var.e;
        String str2 = ul10Var.a;
        ListItemComponent listItemComponent2 = this.O;
        listItemComponent2.setTitle(str2);
        listItemComponent2.setSubtitle(y5r0Var.b.a);
        MenuItemElementType menuItemElementType = y5r0Var.d;
        if (menuItemElementType == MenuItemElementType.DEFAULT) {
            menuItemElementType = y5r0Var.h;
        }
        if (y5r0Var.k) {
            listItemComponent2.setDividers(DividerPosition.TOP, DividerType.MARGIN);
        } else {
            listItemComponent2.setDividers(DividerPosition.NONE, DividerType.NONE);
        }
        pzt0 pzt0Var = this.S;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        int i = f6r0.a[menuItemElementType.ordinal()];
        final int i2 = 1;
        View view = this.a;
        if (i == 1) {
            ListItemSwitchComponent listItemSwitchComponent = (ListItemSwitchComponent) listItemComponent2.getTrailViewAs(ListItemSwitchComponent.class);
            ListItemSwitchComponent listItemSwitchComponent2 = listItemSwitchComponent == null ? new ListItemSwitchComponent(view.getContext(), null, 0, 6, null) : listItemSwitchComponent;
            listItemSwitchComponent2.setChecked(y5r0Var.i);
            listItemComponent2.setTrailImportantForAccessibility(4);
            listItemComponent2.setDebounceClickListener(new epo0(16, this, y5r0Var));
            listItemComponent = listItemSwitchComponent2;
        } else if (i != 2) {
            String str3 = y5r0Var.g;
            String str4 = ul10Var3.a;
            if ((str4 == null || str4.length() == 0) && ((str = ul10Var2.a) == null || str.length() == 0)) {
                final int i3 = 0;
                this.S = Y(new tls(this) { // from class: e6r0
                    public final /* synthetic */ a b;

                    {
                        this.b = this;
                    }

                    @Override // defpackage.tls
                    public final Object invoke(Object obj) {
                        int i4 = i3;
                        zy11 zy11Var = zy11.a;
                        a aVar = this.b;
                        Bitmap bitmap = (Bitmap) obj;
                        switch (i4) {
                            case 0:
                                ListItemComponent listItemComponent3 = aVar.O;
                                if (bitmap == null) {
                                    listItemComponent3.setTrailImage((Drawable) null);
                                    break;
                                } else {
                                    listItemComponent3.setTrailImage(bitmap);
                                    break;
                                }
                            default:
                                ListItemComponent listItemComponent4 = aVar.O;
                                if (bitmap == null) {
                                    listItemComponent4.setLeadImage((Drawable) null);
                                    break;
                                } else {
                                    listItemComponent4.setLeadImage(bitmap);
                                    break;
                                }
                        }
                        return zy11Var;
                    }
                }, str3);
                listItemComponent = null;
            } else {
                ListItemComponent listItemComponent3 = new ListItemComponent(view.getContext(), null, 0, 6, null);
                this.S = Y(new quq0(this, listItemComponent3), str3);
                listItemComponent = listItemComponent3;
            }
        } else {
            ListItemComponent listItemComponent4 = new ListItemComponent(view.getContext(), null, 0, 6, null);
            listItemComponent4.setTrailMode(2);
            listItemComponent = listItemComponent4;
        }
        if (listItemComponent != null) {
            listItemComponent.setTitle(ul10Var3.a);
        }
        if (listItemComponent != null) {
            listItemComponent.setSubtitle(ul10Var2.a);
        }
        listItemComponent2.setTrailView(listItemComponent);
        pzt0 pzt0Var2 = this.R;
        if (pzt0Var2 != null) {
            pzt0Var2.a(null);
        }
        this.R = Y(new tls(this) { // from class: e6r0
            public final /* synthetic */ a b;

            {
                this.b = this;
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                int i4 = i2;
                zy11 zy11Var = zy11.a;
                a aVar = this.b;
                Bitmap bitmap = (Bitmap) obj;
                switch (i4) {
                    case 0:
                        ListItemComponent listItemComponent32 = aVar.O;
                        if (bitmap == null) {
                            listItemComponent32.setTrailImage((Drawable) null);
                            break;
                        } else {
                            listItemComponent32.setTrailImage(bitmap);
                            break;
                        }
                    default:
                        ListItemComponent listItemComponent42 = aVar.O;
                        if (bitmap == null) {
                            listItemComponent42.setLeadImage((Drawable) null);
                            break;
                        } else {
                            listItemComponent42.setLeadImage(bitmap);
                            break;
                        }
                }
                return zy11Var;
            }
        }, y5r0Var.c);
        List h = vng.h(listItemComponent2);
        if (h.isEmpty()) {
            return;
        }
        listItemComponent2.setContentDescription(TextUtils.join(Extension.FIX_SPACE, h));
    }

    @Override // defpackage.w95
    public final void X() {
        this.P.b();
    }

    public final pzt0 Y(tls tlsVar, String str) {
        if (str == null) {
            tlsVar.invoke(null);
            return null;
        }
        return hbp0.e(this.P, null, null, new SettingViewHolder$bindImagesToFields$1(this, tlsVar, str, null), 3);
    }
}
