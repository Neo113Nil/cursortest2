package defpackage;

import android.net.Uri;
import android.widget.ImageView;
import com.ybsdk.core.utils.ColorModel;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.kyc.internal.screens.photo.helpers.CameraLens;
import com.ybsdk.widgets.common.YbButtonView;
import com.ybsdk.widgets.common.YbButtonViewGroup;
import com.ybsdk.widgets.common.c;
import com.ybsdk.widgets.common.d;

/* loaded from: classes3.dex */
public final class vox implements ev31 {
    public static boolean a(fox foxVar) {
        eox eoxVar = foxVar instanceof eox ? (eox) foxVar : null;
        if (eoxVar != null) {
            int i = uox.a[eoxVar.a.ordinal()];
            if (i != 1 && i != 2) {
                if (i == 3 || i == 4) {
                    return true;
                }
                w511.b();
                return false;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ev31
    public final Object q(Object obj) {
        int i;
        int i2;
        int i3;
        pox poxVar;
        oox ooxVar;
        int i4;
        Text.Resource h;
        Uri uri;
        tr7 tr7Var;
        YbButtonViewGroup.b bVar;
        kao a;
        gox goxVar = (gox) obj;
        tnx tnxVar = goxVar.c;
        fox foxVar = goxVar.d;
        aox aoxVar = goxVar.g;
        Text text = null;
        if (aoxVar != null) {
            if (aoxVar instanceof ynx) {
                a = r501.a(((ynx) aoxVar).a, null, null, null, null, null, null, null, null, null, null, null, null, 49150);
            } else {
                if (!(aoxVar instanceof znx)) {
                    w511.b();
                    return null;
                }
                a = r501.a(((znx) aoxVar).a, unr0.h(Text.Companion, dzh0.ybsdk_kyc_camera_init_error_title), new Text.Resource(dzh0.ybsdk_kyc_camera_init_error_subtitle), new Text.Resource(dzh0.ybsdk_card_landing_ok), null, null, null, null, null, null, null, null, null, 49122);
            }
            return new rox(a);
        }
        if (!goxVar.f) {
            Text.Resource h2 = unr0.h(Text.Companion, dzh0.ybsdk_transfer_permission_access_required_title);
            Text.Resource resource = new Text.Resource(dzh0.ybsdk_kyc_permission_description_subtitle);
            int r = kp50.r(80);
            nbv nbvVar = new nbv(nyg0.ybsdk_ic_error_icon, new qev(r, r));
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
            return new sox(new c(h2, resource, new bks(nbvVar, null, 2), new Text.Resource(dzh0.ybsdk_qr_payment_open_settings_button)));
        }
        if (!goxVar.a || tnxVar == null) {
            return new sox(new d(unr0.h(Text.Companion, dzh0.ybsdk_kyc_photo_uploading), text, 2));
        }
        boolean z = foxVar instanceof box;
        cox coxVar = cox.a;
        qnx qnxVar = qnx.b;
        snx snxVar = snx.b;
        rnx rnxVar = rnx.b;
        if (z) {
            poxVar = null;
        } else {
            if (jl40.l(foxVar, coxVar)) {
                if (tnxVar.equals(qnxVar)) {
                    i = dzh0.ybsdk_kyc_main_page_tip;
                } else {
                    if (!tnxVar.equals(snxVar)) {
                        if (tnxVar.equals(rnxVar) || (tnxVar instanceof pnx)) {
                            yhl.d(tnxVar, "Unsupported photo type ");
                            return null;
                        }
                        w511.b();
                        return null;
                    }
                    i = dzh0.ybsdk_kyc_selfie_tip;
                }
            } else if (foxVar instanceof eox) {
                int i5 = uox.a[((eox) foxVar).a.ordinal()];
                if (i5 == 1) {
                    i = dzh0.ybsdk_kyc_tip_photo_check;
                } else if (i5 == 2) {
                    i = dzh0.ybsdk_kyc_tip_photo_check_more_time;
                } else if (i5 == 3) {
                    i = dzh0.ybsdk_kyc_upload_error;
                } else {
                    if (i5 != 4) {
                        w511.b();
                        return null;
                    }
                    if (tnxVar.equals(qnxVar)) {
                        i = dzh0.ybsdk_kyc_error_check;
                    } else {
                        if (!tnxVar.equals(snxVar)) {
                            if (tnxVar.equals(rnxVar) || (tnxVar instanceof pnx)) {
                                yhl.d(tnxVar, "Unsupported photo type ");
                                return null;
                            }
                            w511.b();
                            return null;
                        }
                        i = dzh0.ybsdk_kyc_error_validation;
                    }
                }
            } else {
                if (z) {
                    yhl.d(foxVar, "No tip expected for this stage ");
                    return null;
                }
                if (!(foxVar instanceof dox)) {
                    w511.b();
                    return null;
                }
                i = dzh0.ybsdk_kyc_upload_error;
            }
            Text.Resource h3 = unr0.h(Text.Companion, i);
            if (jl40.l(foxVar, coxVar)) {
                if (tnxVar.equals(qnxVar)) {
                    i2 = cyg0.ybsdk_ic_tip_main;
                } else {
                    if (!tnxVar.equals(snxVar)) {
                        if (tnxVar.equals(rnxVar) || (tnxVar instanceof pnx)) {
                            yhl.d(tnxVar, "Unsupported photo type ");
                            return null;
                        }
                        w511.b();
                        return null;
                    }
                    i2 = cyg0.ybsdk_ic_tip_selfie;
                }
            } else if (foxVar instanceof eox) {
                int i6 = uox.a[((eox) foxVar).a.ordinal()];
                if (i6 == 1 || i6 == 2) {
                    i2 = cyg0.ybsdk_ic_tip_progress;
                } else {
                    if (i6 != 3 && i6 != 4) {
                        w511.b();
                        return null;
                    }
                    i2 = cyg0.ybsdk_ic_tip_error;
                }
            } else {
                if (z) {
                    yhl.d(foxVar, "No tip expected for this stage ");
                    return null;
                }
                if (!(foxVar instanceof dox)) {
                    w511.b();
                    return null;
                }
                i2 = cyg0.ybsdk_ic_tip_error;
            }
            nbv nbvVar2 = new nbv(i2, null);
            if (jl40.l(foxVar, coxVar)) {
                i3 = ung0.ybColor_button_primaryStaticNormal;
            } else if (foxVar instanceof eox) {
                int i7 = uox.a[((eox) foxVar).a.ordinal()];
                if (i7 == 1 || i7 == 2) {
                    i3 = ung0.ybColor_button_primaryStaticNormal;
                } else {
                    if (i7 != 3 && i7 != 4) {
                        w511.b();
                        return null;
                    }
                    i3 = ung0.ybColor_background_warningCamera;
                }
            } else {
                if (z) {
                    yhl.d(foxVar, "No tip expected for this stage ");
                    return null;
                }
                if (!(foxVar instanceof dox)) {
                    w511.b();
                    return null;
                }
                i3 = ung0.ybColor_background_warningCamera;
            }
            poxVar = new pox(h3, nbvVar2, new ColorModel.Attr(i3));
        }
        if (a(foxVar)) {
            ooxVar = null;
        } else {
            ooxVar = new oox(foxVar instanceof cox, goxVar.b ? new nbv(cyg0.ybsdk_flash_on, null) : new nbv(cyg0.ybsdk_flash_off, null));
        }
        if (tnxVar.equals(qnxVar)) {
            i4 = cyg0.ybsdk_kyc_photo_frame_1;
        } else {
            if (!tnxVar.equals(snxVar)) {
                if (tnxVar.equals(rnxVar) || (tnxVar instanceof pnx)) {
                    yhl.d(tnxVar, "Unsupported photo type ");
                    return null;
                }
                w511.b();
                return null;
            }
            i4 = cyg0.ybsdk_kyc_photo_frame_2;
        }
        boolean z2 = foxVar instanceof cox;
        nbv nbvVar3 = z2 ? new nbv(i4, null) : null;
        boolean a2 = a(foxVar);
        n38 n38Var = l38.a;
        if (!a2 && !jl40.l(foxVar, dox.a) && !jl40.l(foxVar, coxVar)) {
            if (foxVar instanceof eox) {
                n38Var = m38.a;
            } else {
                if (!z) {
                    w511.b();
                    return null;
                }
                n38Var = k38.a;
            }
        }
        n38 n38Var2 = n38Var;
        if (tnxVar.equals(qnxVar)) {
            h = unr0.h(Text.Companion, dzh0.ybsdk_kyc_main_page_title);
        } else {
            if (!tnxVar.equals(snxVar)) {
                if (tnxVar.equals(rnxVar) || (tnxVar instanceof pnx)) {
                    yhl.d(tnxVar, "Unsupported photo type ");
                    return null;
                }
                w511.b();
                return null;
            }
            h = unr0.h(Text.Companion, dzh0.ybsdk_kyc_selfie_title);
        }
        stz0 stz0Var = new stz0(h, null, null, new nbv(cyg0.ybsdk_ic_guide, null), null, new ntz0(new ColorModel.Attr(ung0.ybColor_textIcon_primaryStaticInverted)), true, new ColorModel.Attr(ung0.ybColor_textIcon_primaryStaticInverted), null, null, null, null, 32342);
        if (foxVar instanceof eox) {
            uri = ((eox) foxVar).b;
        } else if (z2 || (foxVar instanceof dox)) {
            uri = null;
        } else {
            if (!z) {
                w511.b();
                return null;
            }
            uri = ((box) foxVar).a;
        }
        pbv pbvVar = uri != null ? new pbv(uri.toString(), (ccv) null, rev.d, (dcv) null, (vfv) null, 58) : null;
        if (tnxVar.equals(qnxVar)) {
            tr7Var = new tr7(CameraLens.BACK);
        } else {
            if (!tnxVar.equals(snxVar)) {
                if (tnxVar.equals(rnxVar) || (tnxVar instanceof pnx)) {
                    yhl.d(tnxVar, "Unsupported photo type ");
                    return null;
                }
                w511.b();
                return null;
            }
            tr7Var = new tr7(CameraLens.FRONT);
        }
        tr7 tr7Var2 = tr7Var;
        if (a(foxVar)) {
            ColorModel colorModel = null;
            ColorModel colorModel2 = null;
            ColorModel colorModel3 = null;
            boolean z3 = false;
            bVar = new YbButtonViewGroup.b(YbButtonViewGroup.Orientation.HORIZONTAL, new YbButtonView.a(unr0.h(Text.Companion, dzh0.ybsdk_kyc_button_send), null, null, null, colorModel, colorModel2, colorModel3, false, z3, null, 4094), new YbButtonView.a(new Text.Resource(dzh0.ybsdk_kyc_button_recapture), 0 == true ? 1 : 0, 0 == true ? 1 : 0, colorModel, colorModel2, colorModel3, null, z3, false, null, 4094), null, 8);
        } else {
            bVar = null;
        }
        return new qox(poxVar, ooxVar, nbvVar3, pbvVar, stz0Var, n38Var2, tr7Var2, bVar);
    }
}
