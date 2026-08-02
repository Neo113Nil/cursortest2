package androidx.compose.ui.platform;

import android.view.View;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.unit.Velocity;
import androidx.core.view.NestedScrollingChildHelper;
import androidx.core.view.ViewCompat;
import com.google.android.gms.internal.mlkit_genai_prompt.zzagn;
import java.util.WeakHashMap;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.coroutines.Continuation;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes3.dex */
public final class NestedScrollInteropConnection implements NestedScrollConnection {
    public final int[] consumedScrollCache;
    public final NestedScrollingChildHelper nestedScrollChildHelper;
    public final View view;

    public NestedScrollInteropConnection(View view) {
        this.view = view;
        NestedScrollingChildHelper nestedScrollingChildHelper = new NestedScrollingChildHelper(view);
        nestedScrollingChildHelper.setNestedScrollingEnabled(true);
        this.nestedScrollChildHelper = nestedScrollingChildHelper;
        this.consumedScrollCache = new int[2];
        WeakHashMap weakHashMap = ViewCompat.sViewPropertyAnimatorMap;
        view.setNestedScrollingEnabled(true);
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostFling-RZ2iAVY */
    public final Object mo241onPostFlingRZ2iAVY(long j, long j2, Continuation continuation) {
        NestedScrollingChildHelper nestedScrollingChildHelper = this.nestedScrollChildHelper;
        if (nestedScrollingChildHelper.hasNestedScrollingParent(0)) {
            nestedScrollingChildHelper.stopNestedScroll(0);
        }
        if (nestedScrollingChildHelper.hasNestedScrollingParent(1)) {
            nestedScrollingChildHelper.stopNestedScroll(1);
        }
        return new Velocity(0L);
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostScroll-DzOQY0M */
    public final long mo242onPostScrollDzOQY0M(int i, long j, long j2) {
        if (!this.nestedScrollChildHelper.startNestedScroll(zzagn.m2018access$getScrollAxesk4lQ0M(j2), (i == 1 ? 1 : 0) ^ 1)) {
            return 0L;
        }
        int[] iArr = this.consumedScrollCache;
        ArraysKt___ArraysJvmKt.fill$default(0, iArr);
        int composeToViewOffset = zzagn.composeToViewOffset(Float.intBitsToFloat((int) (j2 >> 32)));
        int composeToViewOffset2 = zzagn.composeToViewOffset(Float.intBitsToFloat((int) (j2 & BodyPartID.bodyIdMax)));
        int composeToViewOffset3 = zzagn.composeToViewOffset(Float.intBitsToFloat((int) (j >> 32)));
        int composeToViewOffset4 = zzagn.composeToViewOffset(Float.intBitsToFloat((int) (j & BodyPartID.bodyIdMax)));
        int i2 = i == 1 ? 1 : 0;
        this.nestedScrollChildHelper.dispatchNestedScrollInternal(composeToViewOffset3, null, composeToViewOffset4, composeToViewOffset, composeToViewOffset2, this.consumedScrollCache, i2 ^ 1);
        return zzagn.m2019access$toOffsetmoWRBKg(composeToViewOffset, j2, iArr, composeToViewOffset2);
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPreFling-QWom1Mo */
    public final Object mo493onPreFlingQWom1Mo(long j, Continuation continuation) {
        float m1067getXimpl = Velocity.m1067getXimpl(j) * (-1.0f);
        float m1068getYimpl = Velocity.m1068getYimpl(j) * (-1.0f);
        NestedScrollingChildHelper nestedScrollingChildHelper = this.nestedScrollChildHelper;
        if (!nestedScrollingChildHelper.dispatchNestedPreFling(m1067getXimpl, m1068getYimpl) && !nestedScrollingChildHelper.dispatchNestedFling(Velocity.m1067getXimpl(j) * (-1.0f), Velocity.m1068getYimpl(j) * (-1.0f), true)) {
            j = 0;
        }
        return new Velocity(j);
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPreScroll-OzD1aCk */
    public final long mo326onPreScrollOzD1aCk(int i, long j) {
        if (!this.nestedScrollChildHelper.startNestedScroll(zzagn.m2018access$getScrollAxesk4lQ0M(j), (i == 1 ? 1 : 0) ^ 1)) {
            return 0L;
        }
        int[] iArr = this.consumedScrollCache;
        ArraysKt___ArraysJvmKt.fill$default(0, iArr);
        int composeToViewOffset = zzagn.composeToViewOffset(Float.intBitsToFloat((int) (j >> 32)));
        int composeToViewOffset2 = zzagn.composeToViewOffset(Float.intBitsToFloat((int) (BodyPartID.bodyIdMax & j)));
        this.nestedScrollChildHelper.dispatchNestedPreScroll(composeToViewOffset, this.consumedScrollCache, composeToViewOffset2, (i == 1 ? 1 : 0) ^ 1, null);
        return zzagn.m2019access$toOffsetmoWRBKg(composeToViewOffset, j, iArr, composeToViewOffset2);
    }
}
