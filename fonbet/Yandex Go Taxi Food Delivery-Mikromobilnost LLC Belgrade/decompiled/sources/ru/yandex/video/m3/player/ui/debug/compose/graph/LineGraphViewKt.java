package ru.yandex.video.m3.player.ui.debug.compose.graph;

import defpackage.aii0;
import defpackage.bts;
import defpackage.c530;
import defpackage.cjs0;
import defpackage.did;
import defpackage.f530;
import defpackage.fid;
import defpackage.kub1;
import defpackage.ldc;
import defpackage.ljs0;
import defpackage.m4m0;
import defpackage.qam;
import defpackage.qeb1;
import defpackage.qke;
import defpackage.rzo;
import defpackage.tls;
import defpackage.vng;
import defpackage.wls;
import defpackage.zy11;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.video.m3.player.ui.debug.view.graph.LineGraphView;

@Metadata(d1 = {"\u0000.\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a/\u0010\b\u001a\u00020\u00072\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0001¢\u0006\u0004\b\b\u0010\t\u001a\u001d\u0010\u000b\u001a\u00020\n2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a\u001d\u0010\r\u001a\u00020\n2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0002¢\u0006\u0004\b\r\u0010\f\u001a/\u0010\u0012\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001a'\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0017\u0010\u0018\"\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b\"\u0014\u0010\u001c\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010\u001b\"\u0014\u0010\u001d\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e\"\u0014\u0010\u001f\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001f\u0010\u001e¨\u0006 "}, d2 = {"", "Lru/yandex/video/m3/player/ui/debug/view/graph/LineGraphView$Event;", "events", "Lf530;", "modifier", "", "ts", "Lzy11;", "LineGraphView", "(Ljava/util/List;Lf530;JLfid;II)V", "", "getUpperBond", "(Ljava/util/List;)F", "getLowerBond", "value", "lowerBound", "upperBound", "height", "getStopY", "(JFFF)F", ClidProvider.TIMESTAMP, "width", "initialTimestamp", "getStopX", "(JFJ)F", "Lldc;", "graphBackgroundColor", "J", "DEFAULT_HISTORY_LENGTH_MS", "DEFAULT_SCALING", "F", "DEFAULT_GRAPH_WIDTH", "video-player_internalRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class LineGraphViewKt {
    private static final float DEFAULT_GRAPH_WIDTH = 4.0f;
    private static final long DEFAULT_HISTORY_LENGTH_MS = 30000;
    private static final float DEFAULT_SCALING = 2.0f;
    private static final long graphBackgroundColor = ldc.b(rzo.f(4279771176L), 0.5f, 0.0f, 0.0f, 0.0f, 14);

    public static final void LineGraphView(final List<? extends LineGraphView.Event> list, f530 f530Var, final long j, fid fidVar, final int i, final int i2) {
        int i3;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1901249538);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (btsVar.e(list) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= btsVar.k(f530Var) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= btsVar.d(j) ? 256 : 128;
        }
        if ((i3 & 147) == 146 && btsVar.E()) {
            btsVar.Y();
        } else {
            if (i4 != 0) {
                f530Var = c530.a;
            }
            f530 b = m4m0.b(ljs0.h(f530Var, 16.0f), graphBackgroundColor, qke.q);
            btsVar.f0(858831394);
            boolean e = ((i3 & 896) == 256) | btsVar.e(list);
            Object Q = btsVar.Q();
            if (e || Q == did.a) {
                Q = new tls() { // from class: ru.yandex.video.m3.player.ui.debug.compose.graph.LineGraphViewKt$LineGraphView$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    public final void invoke(qam qamVar) {
                        float upperBond;
                        float lowerBond;
                        LineGraphView.Event event;
                        float stopY;
                        float stopX;
                        float d = cjs0.d(qamVar.c());
                        float b2 = cjs0.b(qamVar.c());
                        long j2 = j;
                        long j3 = j2 - 30000;
                        upperBond = LineGraphViewKt.getUpperBond(list);
                        lowerBond = LineGraphViewKt.getLowerBond(list);
                        float f = 0.0f;
                        if (list.isEmpty()) {
                            stopY = 0.0f;
                        } else {
                            List<LineGraphView.Event> list2 = list;
                            ListIterator<LineGraphView.Event> listIterator = list2.listIterator(list2.size());
                            while (true) {
                                if (listIterator.hasPrevious()) {
                                    event = listIterator.previous();
                                    if (event.getTimestamp() < j3) {
                                        break;
                                    }
                                } else {
                                    event = null;
                                    break;
                                }
                            }
                            LineGraphView.Event event2 = event;
                            stopY = LineGraphViewKt.getStopY(event2 != null ? event2.getValue() : 0L, lowerBond, upperBond, b2);
                        }
                        for (LineGraphView.Event event3 : list) {
                            if (event3.getTimestamp() >= j3) {
                                stopX = LineGraphViewKt.getStopX(event3.getTimestamp(), d, j3);
                                long j4 = ldc.h;
                                long a = kub1.a(f, stopY);
                                stopY = LineGraphViewKt.getStopY(event3.getValue(), lowerBond, upperBond, b2);
                                qamVar.h(j4, a, kub1.a(stopX, stopY), 4.0f, (r21 & 16) != 0 ? 0 : 0, (r21 & 32) != 0 ? null : null);
                                f = stopX;
                            }
                        }
                        if (j < j2) {
                            d *= (r7 - j3) / 30000.0f;
                        }
                        qamVar.h(ldc.h, kub1.a(f, stopY), kub1.a(d, stopY), 4.0f, (r21 & 16) != 0 ? 0 : 0, (r21 & 32) != 0 ? null : null);
                    }

                    @Override // defpackage.tls
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((qam) obj);
                        return zy11.a;
                    }
                };
                btsVar.o0(Q);
            }
            btsVar.t(false);
            qeb1.a(0, btsVar, (tls) Q, b);
        }
        final f530 f530Var2 = f530Var;
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new wls() { // from class: ru.yandex.video.m3.player.ui.debug.compose.graph.LineGraphViewKt$LineGraphView$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void invoke(fid fidVar2, int i5) {
                    LineGraphViewKt.LineGraphView(list, f530Var2, j, fidVar2, vng.O(i | 1), i2);
                }

                @Override // defpackage.wls
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((fid) obj, ((Number) obj2).intValue());
                    return zy11.a;
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float getLowerBond(List<? extends LineGraphView.Event> list) {
        Long l;
        Iterator<T> it = list.iterator();
        if (it.hasNext()) {
            Long valueOf = Long.valueOf(((LineGraphView.Event) it.next()).getValue());
            while (it.hasNext()) {
                Long valueOf2 = Long.valueOf(((LineGraphView.Event) it.next()).getValue());
                if (valueOf.compareTo(valueOf2) > 0) {
                    valueOf = valueOf2;
                }
            }
            l = valueOf;
        } else {
            l = null;
        }
        if (l != null) {
            return l.longValue() * 2.0f;
        }
        return 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float getStopX(long j, float f, long j2) {
        return ((j - j2) / 30000.0f) * f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float getStopY(long j, float f, float f2, float f3) {
        return (1.0f - (j / (f2 - f))) * f3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float getUpperBond(List<? extends LineGraphView.Event> list) {
        Long l;
        Iterator<T> it = list.iterator();
        if (it.hasNext()) {
            Long valueOf = Long.valueOf(((LineGraphView.Event) it.next()).getValue());
            while (it.hasNext()) {
                Long valueOf2 = Long.valueOf(((LineGraphView.Event) it.next()).getValue());
                if (valueOf.compareTo(valueOf2) < 0) {
                    valueOf = valueOf2;
                }
            }
            l = valueOf;
        } else {
            l = null;
        }
        if (l != null) {
            return l.longValue() * 2.0f;
        }
        return 0.0f;
    }
}
