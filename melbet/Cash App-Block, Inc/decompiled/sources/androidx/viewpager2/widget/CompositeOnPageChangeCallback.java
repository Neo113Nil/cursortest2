package androidx.viewpager2.widget;

import androidx.compose.runtime.OffsetApplier;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.libraries.places.widget.internal.placedetails.photoviewer.PageSelectionIndicator;
import com.google.android.libraries.places.widget.internal.placedetails.photoviewer.PlacesLightboxActivity;
import com.squareup.cash.investing.components.discovery.InvestingStockCarouselView;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import kotlin.reflect.KProperty;

/* loaded from: classes3.dex */
public final class CompositeOnPageChangeCallback extends ViewPager2.OnPageChangeCallback {
    public final /* synthetic */ int $r8$classId;
    public final Object mCallbacks;

    public CompositeOnPageChangeCallback() {
        this.$r8$classId = 0;
        this.mCallbacks = new ArrayList(3);
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public void onPageScrollStateChanged(int i) {
        int i2 = this.$r8$classId;
        Object obj = this.mCallbacks;
        switch (i2) {
            case 0:
                try {
                    Iterator it = ((ArrayList) obj).iterator();
                    while (it.hasNext()) {
                        ((ViewPager2.OnPageChangeCallback) it.next()).onPageScrollStateChanged(i);
                    }
                    break;
                } catch (ConcurrentModificationException e) {
                    a$$ExternalSyntheticBUOutline0.m("Adding and removing callbacks during dispatch to callbacks is not supported", e);
                    return;
                }
            case 1:
                ((FragmentStateAdapter.FragmentMaxLifecycleEnforcer) obj).updateFragmentMaxLifecycle(false);
                break;
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public void onPageScrolled(int i, float f, int i2) {
        int i3 = this.$r8$classId;
        Object obj = this.mCallbacks;
        switch (i3) {
            case 0:
                try {
                    Iterator it = ((ArrayList) obj).iterator();
                    while (it.hasNext()) {
                        ((ViewPager2.OnPageChangeCallback) it.next()).onPageScrolled(i, f, i2);
                    }
                    break;
                } catch (ConcurrentModificationException e) {
                    a$$ExternalSyntheticBUOutline0.m("Adding and removing callbacks during dispatch to callbacks is not supported", e);
                    return;
                }
            case 5:
                ((OffsetApplier) obj).onPageScrolled(f, i);
                break;
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public void onPageSelected(int i) {
        int i2 = this.$r8$classId;
        Object obj = this.mCallbacks;
        switch (i2) {
            case 0:
                try {
                    Iterator it = ((ArrayList) obj).iterator();
                    while (it.hasNext()) {
                        ((ViewPager2.OnPageChangeCallback) it.next()).onPageSelected(i);
                    }
                    break;
                } catch (ConcurrentModificationException e) {
                    a$$ExternalSyntheticBUOutline0.m("Adding and removing callbacks during dispatch to callbacks is not supported", e);
                    return;
                }
            case 1:
                ((FragmentStateAdapter.FragmentMaxLifecycleEnforcer) obj).updateFragmentMaxLifecycle(false);
                break;
            case 2:
                PageSelectionIndicator pageSelectionIndicator = (PageSelectionIndicator) obj;
                int childCount = pageSelectionIndicator.getChildCount();
                int i3 = 0;
                while (i3 < childCount) {
                    pageSelectionIndicator.getChildAt(i3).setSelected(i3 == i);
                    i3++;
                }
                break;
            case 3:
                PlacesLightboxActivity placesLightboxActivity = (PlacesLightboxActivity) obj;
                KProperty[] kPropertyArr = PlacesLightboxActivity.zza;
                placesLightboxActivity.zzq(i);
                if (i != placesLightboxActivity.zzi) {
                    placesLightboxActivity.zzh++;
                    placesLightboxActivity.zzi = i;
                    break;
                }
                break;
            case 4:
                ((InvestingStockCarouselView) obj).currentPage$delegate.setIntValue(i);
                break;
        }
    }

    public /* synthetic */ CompositeOnPageChangeCallback(Object obj, int i) {
        this.$r8$classId = i;
        this.mCallbacks = obj;
    }
}
