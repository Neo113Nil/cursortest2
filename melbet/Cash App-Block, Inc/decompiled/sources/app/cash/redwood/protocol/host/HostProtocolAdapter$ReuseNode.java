package app.cash.redwood.protocol.host;

import androidx.collection.MutableIntObjectMap;
import coil3.svg.internal.AndroidSvg;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes3.dex */
public final class HostProtocolAdapter$ReuseNode {
    public final int changeIndexForAdd;
    public final int childrenTag;
    public final int indexInParent;
    public final int widgetId;
    public int changeIndexForCreate = -1;
    public final ArrayList children = new ArrayList();
    public boolean eligibleForReuse = true;
    public int widgetTag = -1;

    public HostProtocolAdapter$ReuseNode(int i, int i2, int i3, int i4) {
        this.widgetId = i;
        this.childrenTag = i2;
        this.indexInParent = i3;
        this.changeIndexForAdd = i4;
    }

    public final void assignPooledNodeRecursive(MutableIntObjectMap mutableIntObjectMap, UiChange[] uiChangeArr, ProtocolNode protocolNode) {
        mutableIntObjectMap.getClass();
        uiChangeArr.getClass();
        protocolNode.getClass();
        int i = this.widgetId;
        protocolNode.id = i;
        if (((ProtocolNode) mutableIntObjectMap.put(i, protocolNode)) != null) {
            Path$$ExternalSyntheticBUOutline0.m$1((Object) JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "Insert attempted to replace existing widget with ID "));
            return;
        }
        uiChangeArr[this.changeIndexForCreate] = null;
        int i2 = this.changeIndexForAdd;
        if (i2 != -1) {
            uiChangeArr[i2] = null;
        }
        Iterator it = this.children.iterator();
        while (it.hasNext()) {
            HostProtocolAdapter$ReuseNode hostProtocolAdapter$ReuseNode = (HostProtocolAdapter$ReuseNode) it.next();
            AndroidSvg mo1195childrendBpC2Y = protocolNode.mo1195childrendBpC2Y(hostProtocolAdapter$ReuseNode.childrenTag);
            mo1195childrendBpC2Y.getClass();
            hostProtocolAdapter$ReuseNode.assignPooledNodeRecursive(mutableIntObjectMap, uiChangeArr, (ProtocolNode) ((ArrayList) mo1195childrendBpC2Y.renderOptions).get(hostProtocolAdapter$ReuseNode.indexInParent));
        }
    }
}
