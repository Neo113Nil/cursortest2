package defpackage;

import android.content.res.TypedArray;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class wl implements sm {
    public final /* synthetic */ int GWasM1elztuh;
    public final /* synthetic */ Object X1lG3V04pd;
    public final /* synthetic */ Object Yi7zF1RB1;

    public /* synthetic */ wl(int i, Object obj, Object obj2) {
        this.GWasM1elztuh = i;
        this.Yi7zF1RB1 = obj;
        this.X1lG3V04pd = obj2;
    }

    @Override // defpackage.sm
    public final void GWasM1elztuh() {
        boolean isTerminated;
        int i = this.GWasM1elztuh;
        Object obj = this.X1lG3V04pd;
        Object obj2 = this.Yi7zF1RB1;
        switch (i) {
            case 0:
                ((fh0) obj2).E7jCp8Ls.JFJ3QoxA.EljAMC1QTz((tl) obj);
                return;
            case 1:
                ((m10) obj2).GWasM1elztuh.JFJ3QoxA((k10) obj);
                return;
            case 2:
                ((x80) obj2).AvO7iQsrTN.rQPn8YBR(obj);
                return;
            case nr0.INTEGER_FIELD_NUMBER /* 3 */:
                Iterator it = ((List) ((m51) obj2).getValue()).iterator();
                while (it.hasNext()) {
                    ((zd) obj).Yi7zF1RB1().X1lG3V04pd((fh0) it.next());
                }
                return;
            case 4:
                z5 z5Var = (z5) obj2;
                fe feVar = (fe) obj;
                if (z5Var.GWasM1elztuh != null) {
                    feVar.Yi7zF1RB1.OOA6hdeuvCS();
                    return;
                }
                if (z5Var.Yi7zF1RB1 == null) {
                    o4.jivtDDk9H("Unreachable");
                    return;
                }
                y5 y5Var = feVar.GWasM1elztuh;
                ArrayList arrayList = y5Var.GWasM1elztuh;
                CopyOnWriteArrayList copyOnWriteArrayList = y5Var.X1lG3V04pd;
                Iterator it2 = copyOnWriteArrayList.iterator();
                it2.getClass();
                while (true) {
                    int i2 = 0;
                    if (!it2.hasNext()) {
                        copyOnWriteArrayList.clear();
                        int size = arrayList.size();
                        while (i2 < size) {
                            Object obj3 = arrayList.get(i2);
                            i2++;
                            ((bl0) obj3).OOA6hdeuvCS();
                        }
                        arrayList.clear();
                        return;
                    }
                    AutoCloseable autoCloseable = (AutoCloseable) it2.next();
                    if (autoCloseable instanceof AutoCloseable) {
                        autoCloseable.close();
                    } else if (autoCloseable instanceof ExecutorService) {
                        ExecutorService executorService = (ExecutorService) autoCloseable;
                        if (executorService != ForkJoinPool.commonPool() && !(isTerminated = executorService.isTerminated())) {
                            executorService.shutdown();
                            while (!isTerminated) {
                                try {
                                    isTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                                } catch (InterruptedException unused) {
                                    if (i2 == 0) {
                                        executorService.shutdownNow();
                                        i2 = 1;
                                    }
                                }
                            }
                            if (i2 != 0) {
                                Thread.currentThread().interrupt();
                            }
                        }
                    } else if (autoCloseable instanceof TypedArray) {
                        ((TypedArray) autoCloseable).recycle();
                    } else if (autoCloseable instanceof MediaMetadataRetriever) {
                        ((MediaMetadataRetriever) autoCloseable).release();
                    } else {
                        if (!(autoCloseable instanceof MediaDrm)) {
                            throw new IllegalArgumentException();
                        }
                        ((MediaDrm) autoCloseable).release();
                    }
                }
                break;
            case 5:
                ((qa1) obj2).JFJ3QoxA.remove((qa1) obj);
                return;
            case nr0.STRING_SET_FIELD_NUMBER /* 6 */:
                qa1 qa1Var = (qa1) obj2;
                qa1Var.getClass();
                ka1 ka1Var = (ka1) ((la1) obj).Yi7zF1RB1.getValue();
                if (ka1Var != null) {
                    qa1Var.mOu10nynGul.remove(ka1Var.OOA6hdeuvCS);
                    return;
                }
                return;
            default:
                bh1 bh1Var = (bh1) obj2;
                View view = (View) obj;
                int i3 = bh1Var.Y6hRI1cF8 - 1;
                bh1Var.Y6hRI1cF8 = i3;
                if (i3 == 0) {
                    int i4 = ne1.GWasM1elztuh;
                    ie1.Yi7zF1RB1(view, null);
                    ne1.GWasM1elztuh(view, null);
                    view.removeOnAttachStateChangeListener(bh1Var.cilMamHF);
                    return;
                }
                return;
        }
    }
}
