package defpackage;

import android.graphics.Point;
import android.util.Size;
import androidx.compose.foundation.lazy.layout.AndroidPrefetchScheduler;
import androidx.media3.common.a;
import com.google.common.collect.z;
import com.yandex.div.core.state.b;
import com.yandex.messaging.core.net.entities.proto.message.ReactionInfo;
import defpackage.c3f;
import java.io.File;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import kotlin.Pair;
import ru.yandex.video.m3.playback.features.PlaybackFeaturesHolderImpl;

/* loaded from: classes10.dex */
public final /* synthetic */ class y60 implements Comparator {
    public final /* synthetic */ int a;

    public /* synthetic */ y60(int i) {
        this.a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int prefetchRequests$lambda$0;
        z zVar;
        z g;
        int SIZE_COMPARATOR$lambda$26;
        switch (this.a) {
            case 0:
                return Integer.compare(((a) obj).j, ((a) obj2).j);
            case 1:
                return Long.compare(((qk51) obj).a, ((qk51) obj2).a);
            case 2:
                prefetchRequests$lambda$0 = AndroidPrefetchScheduler.prefetchRequests$lambda$0((n3f0) obj, (n3f0) obj2);
                return prefetchRequests$lambda$0;
            case 3:
                return ((a) obj2).j - ((a) obj).j;
            case 4:
                ic5 ic5Var = (ic5) obj;
                ic5 ic5Var2 = (ic5) obj2;
                int compare = Integer.compare(ic5Var.c, ic5Var2.c);
                return compare != 0 ? compare : ic5Var.b.compareTo(ic5Var2.b);
            case 5:
                return Integer.compare(((y59) obj2).b, ((y59) obj).b);
            case 6:
                if (obj == null) {
                    return obj2 == null ? 0 : 1;
                }
                if (obj2 == null) {
                    return -1;
                }
                return ((Comparable) obj).compareTo((Comparable) obj2);
            case 7:
                String name = ((File) obj).getName();
                int i = g3f.f;
                return name.substring(0, i).compareTo(((File) obj2).getName().substring(0, i));
            case 8:
                Integer num = (Integer) obj;
                Integer num2 = (Integer) obj2;
                if (num.intValue() == -1) {
                    return num2.intValue() == -1 ? 0 : -1;
                }
                if (num2.intValue() == -1) {
                    return 1;
                }
                return num.intValue() - num2.intValue();
            case 9:
                return Integer.compare(((lmh) ((List) obj).get(0)).y, ((lmh) ((List) obj2).get(0)).y);
            case 10:
                List list = (List) obj;
                List list2 = (List) obj2;
                int i2 = 13;
                int i3 = 14;
                return hvc.f(umh.c((umh) Collections.max(list, new y60(i2)), (umh) Collections.max(list2, new y60(i2)))).a(list.size(), list2.size()).b((umh) Collections.max(list, new y60(i3)), (umh) Collections.max(list2, new y60(i3)), new y60(i3)).e();
            case 11:
                return ((kmh) Collections.max((List) obj)).compareTo((kmh) Collections.max((List) obj2));
            case 12:
                return ((rmh) ((List) obj).get(0)).compareTo((rmh) ((List) obj2).get(0));
            case 13:
                return umh.c((umh) obj, (umh) obj2);
            case 14:
                umh umhVar = (umh) obj;
                umh umhVar2 = (umh) obj2;
                boolean z = umhVar.x;
                int i4 = umhVar.C;
                if (z && umhVar.A) {
                    g = vmh.FORMAT_VALUE_ORDERING;
                } else {
                    zVar = vmh.FORMAT_VALUE_ORDERING;
                    g = zVar.g();
                }
                return jvc.a.b(Integer.valueOf(umhVar.D), Integer.valueOf(umhVar2.D), g).b(Integer.valueOf(i4), Integer.valueOf(umhVar2.C), g).e();
            case 15:
                b bVar = (b) obj;
                b bVar2 = (b) obj2;
                long j = bVar.a;
                List list3 = bVar.b;
                long j2 = bVar2.a;
                List list4 = bVar2.b;
                if (j != j2) {
                    return (int) (j - j2);
                }
                int min = Math.min(list3.size(), list4.size());
                for (int i5 = 0; i5 < min; i5++) {
                    Pair pair = (Pair) list3.get(i5);
                    Pair pair2 = (Pair) list4.get(i5);
                    int compareTo = ((String) pair.c()).compareTo((String) pair2.c());
                    if (compareTo != 0) {
                        return compareTo;
                    }
                    int compareTo2 = ((String) pair.f()).compareTo((String) pair2.f());
                    if (compareTo2 != 0) {
                        return compareTo2;
                    }
                }
                return list3.size() - list4.size();
            case 16:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                if (bArr.length != bArr2.length) {
                    return bArr.length - bArr2.length;
                }
                for (int i6 = 0; i6 < bArr.length; i6++) {
                    byte b = bArr[i6];
                    byte b2 = bArr2[i6];
                    if (b != b2) {
                        return b - b2;
                    }
                }
                return 0;
            case 17:
                d6w d6wVar = (d6w) obj;
                d6w d6wVar2 = (d6w) obj2;
                return (d6wVar.b - d6wVar.a) - (d6wVar2.b - d6wVar2.a);
            case 18:
                return jl40.q(((u5y) obj).getIndex(), ((u5y) obj2).getIndex());
            case 19:
                ReactionInfo reactionInfo = (ReactionInfo) obj;
                ReactionInfo reactionInfo2 = (ReactionInfo) obj2;
                if (reactionInfo == null) {
                    return reactionInfo2 != null ? 1 : 0;
                }
                if (reactionInfo2 == null) {
                    return -1;
                }
                int compare2 = Integer.compare(reactionInfo2.count, reactionInfo.count);
                return compare2 == 0 ? Integer.compare(reactionInfo2.type, reactionInfo.type) : compare2;
            case 20:
                Size size = (Size) obj;
                Size size2 = (Size) obj2;
                return Long.signum((size.getWidth() * size.getHeight()) - (size2.getWidth() * size2.getHeight()));
            case 21:
                return Long.compare(((Long) obj2).longValue(), ((Long) obj).longValue());
            case 22:
                return ((x34) obj).a.compareTo(((x34) obj2).a);
            case 23:
                SIZE_COMPARATOR$lambda$26 = PlaybackFeaturesHolderImpl.SIZE_COMPARATOR$lambda$26((Point) obj, (Point) obj2);
                return SIZE_COMPARATOR$lambda$26;
            case 24:
                return uil0.b(((til0) obj).a.c, ((til0) obj2).a.c);
            case 25:
                return ((c3f.c) obj).a().compareTo(((c3f.c) obj2).a());
            case 26:
                return ((ups0) obj).a - ((ups0) obj2).a;
            case 27:
                return Float.compare(((ups0) obj).c, ((ups0) obj2).c);
            case 28:
                mnt0 mnt0Var = (mnt0) obj;
                mnt0 mnt0Var2 = (mnt0) obj2;
                int compare3 = Integer.compare(mnt0Var2.b, mnt0Var.b);
                if (compare3 != 0) {
                    return compare3;
                }
                int compareTo3 = mnt0Var.c.compareTo(mnt0Var2.c);
                return compareTo3 != 0 ? compareTo3 : mnt0Var.d.compareTo(mnt0Var2.d);
            default:
                mnt0 mnt0Var3 = (mnt0) obj;
                mnt0 mnt0Var4 = (mnt0) obj2;
                int compare4 = Integer.compare(mnt0Var4.a, mnt0Var3.a);
                if (compare4 != 0) {
                    return compare4;
                }
                int compareTo4 = mnt0Var4.c.compareTo(mnt0Var3.c);
                return compareTo4 != 0 ? compareTo4 : mnt0Var4.d.compareTo(mnt0Var3.d);
        }
    }
}
