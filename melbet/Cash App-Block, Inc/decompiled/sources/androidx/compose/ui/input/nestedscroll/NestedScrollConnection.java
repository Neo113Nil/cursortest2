package androidx.compose.ui.input.nestedscroll;

import androidx.compose.ui.unit.Velocity;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public interface NestedScrollConnection {
    /* renamed from: onPostFling-RZ2iAVY */
    default Object mo241onPostFlingRZ2iAVY(long j, long j2, Continuation continuation) {
        return Velocity.m1064boximpl(0L);
    }

    /* renamed from: onPostScroll-DzOQY0M */
    default long mo242onPostScrollDzOQY0M(int i, long j, long j2) {
        return 0L;
    }

    /* renamed from: onPreFling-QWom1Mo */
    default Object mo493onPreFlingQWom1Mo(long j, Continuation continuation) {
        return Velocity.m1064boximpl(0L);
    }

    /* renamed from: onPreScroll-OzD1aCk */
    default long mo326onPreScrollOzD1aCk(int i, long j) {
        return 0L;
    }
}
