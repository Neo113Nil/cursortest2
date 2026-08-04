package com.gamericefishpro.space.fa;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.NavigationMenuItemView;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends com.gamericefishpro.space.d4.b {
    public final /* synthetic */ int v;
    public final /* synthetic */ View w;

    public /* synthetic */ a(View view, int i) {
        this.v = i;
        this.w = view;
    }

    @Override // com.gamericefishpro.space.d4.b
    public void c(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.v) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                super.c(view, accessibilityEvent);
                accessibilityEvent.setChecked(((CheckableImageButton) this.w).v);
                break;
            default:
                super.c(view, accessibilityEvent);
                break;
        }
    }

    @Override // com.gamericefishpro.space.d4.b
    public final void d(View view, com.gamericefishpro.space.e4.h hVar) {
        int i;
        int i2 = this.v;
        View view2 = this.w;
        View.AccessibilityDelegate accessibilityDelegate = this.d;
        switch (i2) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                AccessibilityNodeInfo accessibilityNodeInfo = hVar.a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                CheckableImageButton checkableImageButton = (CheckableImageButton) view2;
                accessibilityNodeInfo.setCheckable(checkableImageButton.w);
                accessibilityNodeInfo.setChecked(checkableImageButton.v);
                break;
            case 1:
                AccessibilityNodeInfo accessibilityNodeInfo2 = hVar.a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo2);
                accessibilityNodeInfo2.setCheckable(((NavigationMenuItemView) view2).Q);
                break;
            default:
                AccessibilityNodeInfo accessibilityNodeInfo3 = hVar.a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo3);
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) view2;
                int i3 = MaterialButtonToggleGroup.J;
                if (view instanceof MaterialButton) {
                    int i4 = 0;
                    for (int i5 = 0; i5 < materialButtonToggleGroup.getChildCount(); i5++) {
                        if (materialButtonToggleGroup.getChildAt(i5) == view) {
                            i = i4;
                        } else {
                            if ((materialButtonToggleGroup.getChildAt(i5) instanceof MaterialButton) && materialButtonToggleGroup.getChildAt(i5).getVisibility() != 8) {
                                i4++;
                            }
                        }
                    }
                    i = -1;
                } else {
                    i = -1;
                }
                accessibilityNodeInfo3.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(0, 1, i, 1, false, ((MaterialButton) view).H));
                break;
        }
    }
}
