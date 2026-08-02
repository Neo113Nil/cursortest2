package androidx.graphics.shapes;

import androidx.navigation.Navigation$$ExternalSyntheticLambda1;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* loaded from: classes3.dex */
public abstract class Feature {
    public final List cubics;

    public final class Corner extends Feature {
        public final boolean convex;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Corner(List list, boolean z) {
            super(list);
            list.getClass();
            this.convex = z;
        }

        public final String toString() {
            return "Corner: cubics=" + CollectionsKt.joinToString$default(this.cubics, ", ", null, null, 0, null, new Navigation$$ExternalSyntheticLambda1(12), 30) + " convex=" + this.convex;
        }
    }

    public final class Edge extends Feature {
        public final String toString() {
            return "Edge";
        }
    }

    public Feature(List list) {
        list.getClass();
        this.cubics = list;
    }
}
