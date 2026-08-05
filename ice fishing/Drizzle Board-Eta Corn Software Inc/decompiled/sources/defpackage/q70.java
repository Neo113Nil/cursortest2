package defpackage;

import android.content.res.TypedArray;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class q70 {
    public static final /* synthetic */ int[] qoPGr6Ce = {1, 2, 3, 4, 5, 6, 7, 8, 9};

    public static int MdtA4re8(String str, int i, int i2) {
        return (str.hashCode() + i) * i2;
    }

    public static int NCTxEWno(int i, int i2, int i3) {
        return (Integer.hashCode(i) + i2) * i3;
    }

    public static /* synthetic */ String OnDfzHZD(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "INVISIBLE" : "GONE" : "VISIBLE" : "REMOVED";
    }

    public static String P7K7Inc8(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void Qr9iLBAD(h40 h40Var) {
        boolean isTerminated;
        if (h40Var instanceof AutoCloseable) {
            h40Var.close();
            return;
        }
        if (!(h40Var instanceof ExecutorService)) {
            if (h40Var instanceof TypedArray) {
                ((TypedArray) h40Var).recycle();
                return;
            } else if (h40Var instanceof MediaMetadataRetriever) {
                ((MediaMetadataRetriever) h40Var).release();
                return;
            } else {
                if (!(h40Var instanceof MediaDrm)) {
                    throw new IllegalArgumentException();
                }
                ((MediaDrm) h40Var).release();
                return;
            }
        }
        ExecutorService executorService = (ExecutorService) h40Var;
        if (executorService == ForkJoinPool.commonPool() || (isTerminated = executorService.isTerminated())) {
            return;
        }
        executorService.shutdown();
        boolean z = false;
        while (!isTerminated) {
            try {
                isTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
            } catch (InterruptedException unused) {
                if (!z) {
                    executorService.shutdownNow();
                    z = true;
                }
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    public static String VgvYg0wo(String str, int i) {
        return str + i;
    }

    public static StringBuilder b2ZJblxo(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        return sb;
    }

    public static /* synthetic */ String eVhOlqcC(int i) {
        switch (i) {
            case 1:
                return "NONE";
            case 2:
                return "LEFT";
            case 3:
                return "TOP";
            case 4:
                return "RIGHT";
            case 5:
                return "BOTTOM";
            case 6:
                return "BASELINE";
            case 7:
                return "CENTER";
            case 8:
                return "CENTER_X";
            case 9:
                return "CENTER_Y";
            default:
                throw null;
        }
    }

    public static /* synthetic */ void jb9XjC4I(AutoCloseable autoCloseable) {
        boolean isTerminated;
        if (autoCloseable instanceof AutoCloseable) {
            autoCloseable.close();
            return;
        }
        if (!(autoCloseable instanceof ExecutorService)) {
            if (autoCloseable instanceof TypedArray) {
                ((TypedArray) autoCloseable).recycle();
                return;
            } else if (autoCloseable instanceof MediaMetadataRetriever) {
                ((MediaMetadataRetriever) autoCloseable).release();
                return;
            } else {
                if (!(autoCloseable instanceof MediaDrm)) {
                    throw new IllegalArgumentException();
                }
                ((MediaDrm) autoCloseable).release();
                return;
            }
        }
        ExecutorService executorService = (ExecutorService) autoCloseable;
        if (executorService == ForkJoinPool.commonPool() || (isTerminated = executorService.isTerminated())) {
            return;
        }
        executorService.shutdown();
        boolean z = false;
        while (!isTerminated) {
            try {
                isTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
            } catch (InterruptedException unused) {
                if (!z) {
                    executorService.shutdownNow();
                    z = true;
                }
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    public static /* synthetic */ int k3x7lurq(int i) {
        if (i != 0) {
            return i - 1;
        }
        throw null;
    }

    public static /* synthetic */ String ow5vqvCr(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "null" : "REMOVING" : "ADDING" : "NONE";
    }

    public static final void qoPGr6Ce(View view, int i) {
        view.getClass();
        int k3x7lurq = k3x7lurq(i);
        if (k3x7lurq == 0) {
            ViewParent parent = view.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                if (ej.ytu5o6f4(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup);
                }
                viewGroup.removeView(view);
                return;
            }
            return;
        }
        if (k3x7lurq == 1) {
            if (ej.ytu5o6f4(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
            }
            view.setVisibility(0);
            return;
        }
        if (k3x7lurq == 2) {
            if (ej.ytu5o6f4(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
            }
            view.setVisibility(8);
            return;
        }
        if (k3x7lurq != 3) {
            return;
        }
        if (ej.ytu5o6f4(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
        }
        view.setVisibility(4);
    }

    public static String wxUZMvaN(int i, int i2, String str, String str2) {
        return str + i + str2 + i2;
    }
}
