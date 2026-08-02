package com.bugsnag.android;

import androidx.compose.runtime.Invalidation;
import androidx.compose.ui.node.LayoutNode;
import com.squareup.cash.data.profile.RealProfileAliasRepositoryKt;
import com.squareup.cash.db.profile.ProfileAlias;
import com.squareup.protos.franklin.api.UiAlias;
import java.io.File;
import java.util.Comparator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* loaded from: classes.dex */
public final /* synthetic */ class EventStore$$ExternalSyntheticLambda0 implements Comparator {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ EventStore$$ExternalSyntheticLambda0(int i) {
        this.$r8$classId = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                File file = (File) obj;
                File file2 = (File) obj2;
                if (file == null && file2 == null) {
                    return 0;
                }
                if (file == null) {
                    return 1;
                }
                if (file2 == null) {
                    return -1;
                }
                return file.compareTo(file2);
            case 1:
                return Intrinsics.compare(((Invalidation) obj).location, ((Invalidation) obj2).location);
            case 2:
                LayoutNode layoutNode = (LayoutNode) obj;
                LayoutNode layoutNode2 = (LayoutNode) obj2;
                float f = layoutNode.layoutDelegate.measurePassDelegate.zIndex;
                float f2 = layoutNode2.layoutDelegate.measurePassDelegate.zIndex;
                return f == f2 ? Intrinsics.compare(layoutNode.getPlaceOrder$ui(), layoutNode2.getPlaceOrder$ui()) : Float.compare(f, f2);
            case 3:
                IntRange intRange = (IntRange) obj;
                IntRange intRange2 = (IntRange) obj2;
                return (intRange.last - intRange.first) - (intRange2.last - intRange2.first);
            case 4:
                ProfileAlias profileAlias = (ProfileAlias) obj;
                ProfileAlias profileAlias2 = (ProfileAlias) obj2;
                profileAlias.getClass();
                profileAlias2.getClass();
                UiAlias.Type type2 = profileAlias.f1121type;
                UiAlias.Type type3 = profileAlias2.f1121type;
                if (type2 == type3) {
                    return profileAlias.canonical_text.compareTo(profileAlias2.canonical_text);
                }
                List list = RealProfileAliasRepositoryKt.TYPE_ORDER;
                return list.indexOf(type2) - list.indexOf(type3);
            default:
                return 0;
        }
    }
}
