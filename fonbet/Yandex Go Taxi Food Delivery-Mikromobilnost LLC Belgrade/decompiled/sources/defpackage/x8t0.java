package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.work.impl.WorkDatabase;
import com.yandex.go.address_confirmation.navigation.a;
import com.yandex.go.pickup_from_photo.api.PickupFromPhotoPayload$Origin;
import java.util.ArrayList;
import java.util.List;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.masstransit.router.f;
import ru.yandex.taxi.widget.dialog.AlertDialogModalView;

/* loaded from: classes13.dex */
public final /* synthetic */ class x8t0 implements tls {
    public final /* synthetic */ int a;

    public /* synthetic */ x8t0(int i) {
        this.a = i;
    }

    /* JADX WARN: Finally extract failed */
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        ull0 T0;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        switch (i) {
            case 0:
                ((cne0) obj).u("OnboardingState", true);
                return zy11Var;
            case 1:
                ((a) obj).o1(PickupFromPhotoPayload$Origin.CLARIFY);
                return zy11Var;
            case 2:
                ((a) obj).o1(PickupFromPhotoPayload$Origin.SUGGEST);
                return zy11Var;
            case 3:
                ((uqe0) obj).n1();
                return zy11Var;
            case 4:
                ((uqe0) obj).n1();
                return zy11Var;
            case 5:
                return Integer.valueOf(((d0l0) obj).b.size());
            case 6:
                qam qamVar = (qam) obj;
                float w0 = qamVar.w0(6.0f);
                long j = bq2.b;
                long floatToRawIntBits = (Float.floatToRawIntBits(r13) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) | (Float.floatToRawIntBits(w0 / 2.0f) << 32);
                float intBitsToFloat = Float.intBitsToFloat((int) (qamVar.c() >> 32)) - w0;
                float intBitsToFloat2 = Float.intBitsToFloat((int) (qamVar.c() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) - w0;
                qam.K(qamVar, j, floatToRawIntBits, (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD), new jvu0(0, 0, 30, w0, 0.0f), 104);
                return zy11Var;
            case 7:
                return new pbv((dcv) null, (dcv) null, (tev) rev.e, (vfv) h2b1.G, (String) obj, false);
            case 8:
                ca1 ca1Var = new ca1((ListItemComponent) obj, 22);
                ListItemComponent listItemComponent = (ListItemComponent) ((View) ca1Var.R);
                int h = c.h(50, listItemComponent);
                listItemComponent.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                listItemComponent.setMinHeight(h);
                listItemComponent.setVerticalPadding(tje.u(10, listItemComponent.getContext()));
                listItemComponent.setTitleTextSizePx(tje.r(mrg0.component_text_size_caption, listItemComponent.getContext()));
                listItemComponent.setSubtitleTextSizePx(tje.r(mrg0.component_text_size_caption_secondary, listItemComponent.getContext()));
                listItemComponent.setTitleColorAttr(xng0.textMain);
                listItemComponent.setSubtitleColorAttr(xng0.textMinor);
                return ca1Var;
            case 9:
                w511 w511Var = fa51.z;
                ia51 X0 = ((WorkDatabase) obj).X0();
                return (List) w511Var.mo104apply((List) androidx.room.util.a.b(X0.a, true, true, new qq31(19, X0)));
            case 10:
                ((lbu0) obj).n1();
                return zy11Var;
            case 11:
                lbu0 lbu0Var = (lbu0) obj;
                int i2 = 9;
                switch (lbu0Var.a) {
                    case 0:
                        ((ap9) lbu0Var.b).r(new qu(i2));
                        return zy11Var;
                    default:
                        c2n0 c2n0Var = (c2n0) lbu0Var.b;
                        c2n0Var.r(new qu(i2));
                        ((egi) c2n0Var.F).invoke();
                        return zy11Var;
                }
            case 12:
                T0 = ((oll0) obj).T0("SELECT user_sticker_pack_id FROM user_sticker_packs ORDER BY user_sticker_pack_order ASC");
                try {
                    ArrayList arrayList = new ArrayList();
                    while (T0.q()) {
                        arrayList.add(T0.Y1(0));
                    }
                    return (String[]) arrayList.toArray(new String[0]);
                } catch (Throwable th) {
                    throw th;
                }
            case 13:
                try {
                    ((oll0) obj).T0("DELETE FROM user_sticker_packs").q();
                    return zy11Var;
                } finally {
                }
            case 14:
                T0 = ((oll0) obj).T0("SELECT sticker_user_pack_id FROM sticker_user_packs ORDER BY sticker_user_pack_order ASC");
                try {
                    ArrayList arrayList2 = new ArrayList();
                    while (T0.q()) {
                        arrayList2.add(T0.Y1(0));
                    }
                    return (String[]) arrayList2.toArray(new String[0]);
                } catch (Throwable th2) {
                    throw th2;
                }
            case 15:
                T0 = ((oll0) obj).T0("SELECT sticker_pack_id FROM sticker_pack_list WHERE is_local_pack=0");
                try {
                    ArrayList arrayList3 = new ArrayList();
                    while (T0.q()) {
                        arrayList3.add(T0.Y1(0));
                    }
                    return (String[]) arrayList3.toArray(new String[0]);
                } catch (Throwable th3) {
                    throw th3;
                }
            case 16:
                try {
                    ((oll0) obj).T0("DELETE FROM sticker_user_packs").q();
                    return zy11Var;
                } finally {
                }
            case 17:
                try {
                    ((oll0) obj).T0("DELETE FROM sticker_panel_pack_view").q();
                    return zy11Var;
                } finally {
                }
            case 18:
                try {
                    ((oll0) obj).T0("DELETE FROM sticker_panel_sticker_view").q();
                    return zy11Var;
                } finally {
                }
            case 19:
                return new zdu0(false, false, 3);
            case 20:
                ((AlertDialogModalView) obj).setOnTouchOutsideListener(null);
                return zy11Var;
            case 21:
                f fVar = (f) obj;
                b2w b2wVar = fVar.a.G;
                if (b2wVar != null) {
                    b2wVar.a.l(fVar.b.a);
                }
                return zy11Var;
            case 22:
                ListItemComponent listItemComponent2 = new ListItemComponent(((ViewGroup) obj).getContext(), null, 0, 6, null);
                lob1.e(listItemComponent2);
                lob1.d(listItemComponent2);
                return listItemComponent2;
            case 23:
                return new m0o((ListItemComponent) obj, 1);
            case 24:
                ListItemComponent listItemComponent3 = new ListItemComponent(((ViewGroup) obj).getContext(), null, 0, 6, null);
                lob1.e(listItemComponent3);
                lob1.d(listItemComponent3);
                return listItemComponent3;
            case 25:
                return new yfu0((ListItemComponent) obj, 0);
            case 26:
                ListItemComponent listItemComponent4 = new ListItemComponent(((ViewGroup) obj).getContext(), null, 0, 6, null);
                lob1.e(listItemComponent4);
                lob1.d(listItemComponent4);
                return listItemComponent4;
            case 27:
                return new yfu0((ListItemComponent) obj, 2);
            case 28:
                ListItemComponent listItemComponent5 = new ListItemComponent(((ViewGroup) obj).getContext(), null, 0, 6, null);
                lob1.e(listItemComponent5);
                lob1.d(listItemComponent5);
                return listItemComponent5;
            default:
                return new yfu0((ListItemComponent) obj, 1);
        }
    }
}
