package com.fillr.browsersdk.adapters;

import android.content.DialogInterface;
import androidx.appcompat.widget.Toolbar;
import com.fillr.core.BaseFragment;
import com.fillr.m1;
import com.fillr.profile.ProfileDetailedViewFragment;
import net.oneformapp.schema.Element;

/* loaded from: classes4.dex */
public final class FillrBaseAdapter$2 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Element val$childElement;
    public final /* synthetic */ Object val$hostingFragment;

    public /* synthetic */ FillrBaseAdapter$2(Object obj, Element element, int i) {
        this.$r8$classId = i;
        this.val$hostingFragment = obj;
        this.val$childElement = element;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.$r8$classId;
        Element element = this.val$childElement;
        Object obj = this.val$hostingFragment;
        switch (i2) {
            case 0:
                BaseFragment baseFragment = (BaseFragment) obj;
                if (baseFragment != null) {
                    baseFragment.onManualEntry(element);
                    break;
                }
                break;
            default:
                m1 m1Var = (m1) obj;
                if (-1 != i) {
                    dialogInterface.dismiss();
                    break;
                } else {
                    ProfileDetailedViewFragment profileDetailedViewFragment = (ProfileDetailedViewFragment) m1Var.a;
                    Toolbar.AnonymousClass1 anonymousClass1 = profileDetailedViewFragment.profileManager;
                    if (anonymousClass1 != null) {
                        anonymousClass1.removeProfileData(profileDetailedViewFragment.parent, element, profileDetailedViewFragment.getActivity());
                    }
                    profileDetailedViewFragment.readAllArrayElements();
                    ((ProfileDetailedViewFragment) m1Var.a).constructViews();
                    break;
                }
        }
    }
}
