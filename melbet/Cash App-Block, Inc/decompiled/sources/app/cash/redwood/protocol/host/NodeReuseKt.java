package app.cash.redwood.protocol.host;

import app.cash.arcade.protocol.host.ArcadeHostProtocol;
import coil3.svg.internal.AndroidSvg;
import com.squareup.cash.clientroutes.ClientRoute;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;

/* loaded from: classes3.dex */
public abstract class NodeReuseKt {
    public static List getDeepLinkSpecs() {
        return ClientRoute.ViewDocumentStockTaxFormList.deepLinkSpecs;
    }

    public static final long shapeHash(ArcadeHostProtocol arcadeHostProtocol, HostProtocolAdapter$ReuseNode hostProtocolAdapter$ReuseNode) {
        int i;
        int[] childrenTags;
        arcadeHostProtocol.getClass();
        if (!hostProtocolAdapter$ReuseNode.eligibleForReuse || (i = hostProtocolAdapter$ReuseNode.widgetTag) == -1) {
            return 0L;
        }
        long j = i;
        WidgetHostProtocol m1194widgetWCEpcRY = arcadeHostProtocol.m1194widgetWCEpcRY(i);
        if (m1194widgetWCEpcRY != null && (childrenTags = m1194widgetWCEpcRY.getChildrenTags()) != null) {
            for (int i2 : childrenTags) {
                j = (j * 37) + i2;
                Iterator it = hostProtocolAdapter$ReuseNode.children.iterator();
                int i3 = 0;
                while (it.hasNext()) {
                    HostProtocolAdapter$ReuseNode hostProtocolAdapter$ReuseNode2 = (HostProtocolAdapter$ReuseNode) it.next();
                    if (hostProtocolAdapter$ReuseNode2.childrenTag == i2) {
                        if (hostProtocolAdapter$ReuseNode2.indexInParent != i3) {
                            return 0L;
                        }
                        i3++;
                        j = (j * 41) + shapeHash(arcadeHostProtocol, hostProtocolAdapter$ReuseNode2);
                    }
                }
            }
        }
        return j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0074, code lost:
    
        if (r7 == r6.size()) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0077, code lost:
    
        r3 = r3 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean shapesEqual(ArcadeHostProtocol arcadeHostProtocol, HostProtocolAdapter$ReuseNode hostProtocolAdapter$ReuseNode, ProtocolNode protocolNode) {
        int[] childrenTags;
        List list;
        arcadeHostProtocol.getClass();
        protocolNode.getClass();
        if (hostProtocolAdapter$ReuseNode.eligibleForReuse && hostProtocolAdapter$ReuseNode.widgetTag != -1) {
            int mo1196getWidgetTagBlhN7y0 = protocolNode.mo1196getWidgetTagBlhN7y0();
            int i = hostProtocolAdapter$ReuseNode.widgetTag;
            if (mo1196getWidgetTagBlhN7y0 == i) {
                WidgetHostProtocol m1194widgetWCEpcRY = arcadeHostProtocol.m1194widgetWCEpcRY(i);
                if (m1194widgetWCEpcRY == null || (childrenTags = m1194widgetWCEpcRY.getChildrenTags()) == null) {
                    return true;
                }
                int length = childrenTags.length;
                int i2 = 0;
                loop0: while (i2 < length) {
                    int i3 = childrenTags[i2];
                    ArrayList arrayList = hostProtocolAdapter$ReuseNode.children;
                    AndroidSvg mo1195childrendBpC2Y = protocolNode.mo1195childrendBpC2Y(i3);
                    if (mo1195childrendBpC2Y == null || (list = (ArrayList) mo1195childrendBpC2Y.renderOptions) == null) {
                        list = EmptyList.INSTANCE;
                    }
                    Iterator it = arrayList.iterator();
                    int i4 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        HostProtocolAdapter$ReuseNode hostProtocolAdapter$ReuseNode2 = (HostProtocolAdapter$ReuseNode) it.next();
                        if (hostProtocolAdapter$ReuseNode2.childrenTag == i3) {
                            if (hostProtocolAdapter$ReuseNode2.indexInParent != i4 || i4 >= list.size()) {
                                break loop0;
                            }
                            int i5 = i4 + 1;
                            if (!shapesEqual(arcadeHostProtocol, hostProtocolAdapter$ReuseNode2, (ProtocolNode) list.get(i4))) {
                                break loop0;
                            }
                            i4 = i5;
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }

    public static final long shapeHash(ArcadeHostProtocol arcadeHostProtocol, ProtocolNode protocolNode) {
        int[] childrenTags;
        arcadeHostProtocol.getClass();
        protocolNode.getClass();
        long mo1196getWidgetTagBlhN7y0 = protocolNode.mo1196getWidgetTagBlhN7y0();
        WidgetHostProtocol m1194widgetWCEpcRY = arcadeHostProtocol.m1194widgetWCEpcRY(protocolNode.mo1196getWidgetTagBlhN7y0());
        if (m1194widgetWCEpcRY != null && (childrenTags = m1194widgetWCEpcRY.getChildrenTags()) != null) {
            for (int i : childrenTags) {
                mo1196getWidgetTagBlhN7y0 = (mo1196getWidgetTagBlhN7y0 * 37) + i;
                AndroidSvg mo1195childrendBpC2Y = protocolNode.mo1195childrendBpC2Y(i);
                if (mo1195childrendBpC2Y != null) {
                    Iterator it = ((ArrayList) mo1195childrendBpC2Y.renderOptions).iterator();
                    while (it.hasNext()) {
                        mo1196getWidgetTagBlhN7y0 = (mo1196getWidgetTagBlhN7y0 * 41) + shapeHash(arcadeHostProtocol, (ProtocolNode) it.next());
                    }
                }
            }
        }
        return mo1196getWidgetTagBlhN7y0;
    }
}
