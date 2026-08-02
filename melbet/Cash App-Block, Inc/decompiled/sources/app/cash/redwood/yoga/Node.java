package app.cash.redwood.yoga;

import androidx.room.CoroutinesRoom;
import app.cash.redwood.yoga.internal.YGConfig;
import app.cash.redwood.yoga.internal.YGLayout;
import app.cash.redwood.yoga.internal.YGNode;
import app.cash.redwood.yoga.internal.YGStyle;
import app.cash.redwood.yoga.internal.Yoga;
import app.cash.redwood.yoga.internal.enums.YGEdge;
import app.cash.redwood.yoga.internal.enums.YGUnit;
import app.cash.redwood.yoga.internal.event.EmptyEventData;
import app.cash.redwood.yoga.internal.event.Event;
import bo.app.yf$$ExternalSyntheticLambda10;
import com.fillr.n;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.collections.ReversedList;

/* loaded from: classes3.dex */
public final class Node {
    public final ReversedList children;

    /* renamed from: native, reason: not valid java name */
    public final YGNode f60native;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Node() {
        this(r1);
        Yoga yoga = Yoga.INSTANCE;
        YGConfig yGConfig = YGConfig.Default;
        yGConfig.getClass();
        YGNode yGNode = new YGNode();
        yGNode.measure = new n.b(3);
        yGNode.baseline = new CoroutinesRoom.Companion(16);
        yGNode.style = new YGStyle();
        yGNode.layout = new YGLayout();
        yGNode.children = new ArrayList();
        yGNode.config = new YGConfig();
        ArrayList arrayList = new ArrayList(2);
        for (int i = 0; i < 2; i++) {
            arrayList.add(Yoga.YGValueUndefined);
        }
        yGNode.resolvedDimensions = arrayList;
        yGNode.flags = new LinkedHashMap();
        yGNode.config = yGConfig;
        LinkedHashMap linkedHashMap = Event.listeners;
        Event.publish(new EmptyEventData());
    }

    public final float getMargin(YGEdge yGEdge) {
        YGNode yGNode = this.f60native;
        YGNode yGNode2 = yGNode.owner;
        if ((yGNode2 != null ? new Node(yGNode2) : null) != null) {
            Yoga yoga = Yoga.INSTANCE;
            yGNode.getClass();
            return yGNode.style.margin.get(yGEdge.ordinal()).value;
        }
        Yoga yoga2 = Yoga.INSTANCE;
        yGNode.getClass();
        return yGNode.style.padding.get(yGEdge.ordinal()).value;
    }

    public final void setMargin(YGEdge yGEdge, float f) {
        YGNode yGNode = this.f60native;
        YGNode yGNode2 = yGNode.owner;
        if ((yGNode2 != null ? new Node(yGNode2) : null) != null) {
            Yoga yoga = Yoga.INSTANCE;
            yGNode.getClass();
            YGUnit yGUnit = YGUnit.YGUnitUndefined;
            Yoga.updateStyleIndexed(yGNode, yGEdge, f, new yf$$ExternalSyntheticLambda10(4));
            return;
        }
        Yoga yoga2 = Yoga.INSTANCE;
        yGNode.getClass();
        YGUnit yGUnit2 = YGUnit.YGUnitUndefined;
        Yoga.updateStyleIndexed(yGNode, yGEdge, f, new yf$$ExternalSyntheticLambda10(3));
    }

    public final String toString() {
        return "Node(" + this.f60native + ")";
    }

    public Node(YGNode yGNode) {
        yGNode.getClass();
        this.f60native = yGNode;
        this.children = new ReversedList(this);
    }
}
