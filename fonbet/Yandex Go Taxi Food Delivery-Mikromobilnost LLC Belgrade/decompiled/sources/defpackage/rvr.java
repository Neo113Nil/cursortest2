package defpackage;

import android.os.Parcelable;
import android.view.View;
import androidx.compose.ui.focus.d;
import androidx.compose.ui.focus.e;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.semantics.c;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.moduleinstall.internal.ApiFeatureRequest;
import com.google.android.gms.location.ActivityTransition;
import com.google.android.gms.location.DetectedActivity;
import java.io.IOException;
import java.util.Comparator;
import java.util.Date;
import kotlin.Pair;
import org.bouncycastle.cms.CMSException;
import org.bouncycastle.tsp.TSPException;
import ru.CryptoPro.CAdES.tools.CAdESUtility;
import ru.CryptoPro.XAdES.SignatureTimeStamp;

/* loaded from: classes10.dex */
public final class rvr implements Comparator {
    public final /* synthetic */ int a;
    public static final rvr b = new rvr(0);
    public static final rvr c = new rvr(1);
    public static final rvr w = new rvr(2);
    public static final rvr x = new rvr(3);
    public static final /* synthetic */ rvr y = new rvr(4);
    public static final /* synthetic */ rvr z = new rvr(5);
    public static final /* synthetic */ rvr A = new rvr(21);

    public /* synthetic */ rvr(int i) {
        this.a = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.lang.Object, java.lang.Object[]] */
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                d dVar = (d) obj;
                d dVar2 = (d) obj2;
                if (e.s(dVar) && e.s(dVar2)) {
                    LayoutNode P = qje.P(dVar);
                    LayoutNode P2 = qje.P(dVar2);
                    if (!jl40.l(P, P2)) {
                        LayoutNode[] layoutNodeArr = new LayoutNode[16];
                        int i = 0;
                        while (P != null) {
                            int i2 = i + 1;
                            if (layoutNodeArr.length < i2) {
                                int length = layoutNodeArr.length;
                                ?? r4 = new Object[Math.max(i2, length * 2)];
                                System.arraycopy(layoutNodeArr, 0, r4, 0, length);
                                layoutNodeArr = r4;
                            }
                            if (i != 0) {
                                System.arraycopy(layoutNodeArr, 0, layoutNodeArr, 0 + 1, i + 0);
                            }
                            layoutNodeArr[0] = P;
                            i++;
                            P = P.s();
                        }
                        LayoutNode[] layoutNodeArr2 = new LayoutNode[16];
                        int i3 = 0;
                        while (P2 != null) {
                            int i4 = i3 + 1;
                            if (layoutNodeArr2.length < i4) {
                                int length2 = layoutNodeArr2.length;
                                ?? r42 = new Object[Math.max(i4, length2 * 2)];
                                System.arraycopy(layoutNodeArr2, 0, r42, 0, length2);
                                layoutNodeArr2 = r42;
                            }
                            if (i3 != 0) {
                                System.arraycopy(layoutNodeArr2, 0, layoutNodeArr2, 0 + 1, i3 + 0);
                            }
                            layoutNodeArr2[0] = P2;
                            i3++;
                            P2 = P2.s();
                        }
                        int min = Math.min(i - 1, i3 - 1);
                        if (min >= 0) {
                            int i5 = 0;
                            while (jl40.l(layoutNodeArr[i5], layoutNodeArr2[i5])) {
                                if (i5 != min) {
                                    i5++;
                                }
                            }
                            return jl40.q(layoutNodeArr[i5].t(), layoutNodeArr2[i5].t());
                        }
                        ny61.r("Could not find a common ancestor between the two FocusModifiers.");
                    }
                } else {
                    if (e.s(dVar)) {
                        return -1;
                    }
                    if (e.s(dVar2)) {
                        return 1;
                    }
                }
                return 0;
            case 1:
                zii0 h = ((c) obj).h();
                zii0 h2 = ((c) obj2).h();
                int compare = Float.compare(h.a, h2.a);
                if (compare != 0) {
                    return compare;
                }
                int compare2 = Float.compare(h.b, h2.b);
                if (compare2 != 0) {
                    return compare2;
                }
                int compare3 = Float.compare(h.d, h2.d);
                return compare3 != 0 ? compare3 : Float.compare(h.c, h2.c);
            case 2:
                zii0 h3 = ((c) obj).h();
                zii0 h4 = ((c) obj2).h();
                int compare4 = Float.compare(h4.c, h3.c);
                if (compare4 != 0) {
                    return compare4;
                }
                int compare5 = Float.compare(h3.b, h4.b);
                if (compare5 != 0) {
                    return compare5;
                }
                int compare6 = Float.compare(h3.d, h4.d);
                return compare6 != 0 ? compare6 : Float.compare(h4.a, h3.a);
            case 3:
                Pair pair = (Pair) obj;
                Pair pair2 = (Pair) obj2;
                int compare7 = Float.compare(((zii0) pair.c()).b, ((zii0) pair2.c()).b);
                return compare7 != 0 ? compare7 : Float.compare(((zii0) pair.c()).d, ((zii0) pair2.c()).d);
            case 4:
                Parcelable.Creator<GoogleSignInAccount> creator = GoogleSignInAccount.CREATOR;
                return ((Scope) obj).getScopeUri().compareTo(((Scope) obj2).getScopeUri());
            case 5:
                Feature feature = (Feature) obj;
                Feature feature2 = (Feature) obj2;
                Parcelable.Creator<ApiFeatureRequest> creator2 = ApiFeatureRequest.CREATOR;
                return !feature.getName().equals(feature2.getName()) ? feature.getName().compareTo(feature2.getName()) : (feature.getVersion() > feature2.getVersion() ? 1 : (feature.getVersion() == feature2.getVersion() ? 0 : -1));
            case 6:
                return ((int[]) obj)[0] - ((int[]) obj2)[0];
            case 7:
                vdr vdrVar = (vdr) obj;
                vdr vdrVar2 = (vdr) obj2;
                int i6 = vdrVar.b + vdrVar.d;
                int i7 = vdrVar2.b + vdrVar2.d;
                if (i6 < i7) {
                    return -1;
                }
                if (i6 > i7) {
                    return 1;
                }
                return Integer.compare(vdrVar.c, vdrVar2.c);
            case 8:
                return ((g3u0) obj).d - ((g3u0) obj2).d;
            case 9:
                return Integer.compare(((xhx) obj).a, ((xhx) obj2).a);
            case 10:
                return ((Comparable) obj).compareTo((Comparable) obj2);
            case 11:
                return Long.compare(((nzz) obj2).c, ((nzz) obj).c);
            case 12:
                mhc0 mhc0Var = (mhc0) obj;
                mhc0 mhc0Var2 = (mhc0) obj2;
                if (mhc0Var2 == null) {
                    return -1;
                }
                Integer valueOf = mhc0Var != null ? Integer.valueOf(Float.compare(mhc0Var.a, mhc0Var2.a)) : null;
                if (valueOf != null) {
                    return valueOf.intValue();
                }
                return -1;
            case 13:
                return ((View) obj).getTop() - ((View) obj2).getTop();
            case 14:
                xs61 xs61Var = (xs61) obj;
                xs61 xs61Var2 = (xs61) obj2;
                int compareTo = ((Date) xs61Var.a.c.b).compareTo((Date) xs61Var2.a.c.b);
                return compareTo == 0 ? Integer.compare(xs61Var.b, xs61Var2.b) * (-1) : compareTo;
            case 15:
                return ((Date) ((SignatureTimeStamp) obj).getTimestampToken().c.b).compareTo((Date) ((SignatureTimeStamp) obj2).getTimestampToken().c.b);
            case 16:
                return ((Date) ((m8z0) obj).c.b).compareTo((Date) ((m8z0) obj2).c.b);
            case 17:
                try {
                    return ((Date) CAdESUtility.convertAttributeValueToTimestampToken((vc3) obj).c.b).compareTo((Date) CAdESUtility.convertAttributeValueToTimestampToken((vc3) obj2).c.b);
                } catch (IOException | CMSException | TSPException e) {
                    ny61.o(e);
                    return 0;
                }
            case 18:
                return ((Scope) obj).getScopeUri().compareTo(((Scope) obj2).getScopeUri());
            case 19:
                ActivityTransition activityTransition = (ActivityTransition) obj;
                ActivityTransition activityTransition2 = (ActivityTransition) obj2;
                cvw.l(activityTransition);
                cvw.l(activityTransition2);
                int activityType = activityTransition.getActivityType();
                int activityType2 = activityTransition2.getActivityType();
                if (activityType == activityType2) {
                    int transitionType = activityTransition.getTransitionType();
                    int transitionType2 = activityTransition2.getTransitionType();
                    if (transitionType == transitionType2) {
                        return 0;
                    }
                    if (transitionType >= transitionType2) {
                        return 1;
                    }
                } else if (activityType >= activityType2) {
                    return 1;
                }
                return -1;
            case 20:
                DetectedActivity detectedActivity = (DetectedActivity) obj;
                DetectedActivity detectedActivity2 = (DetectedActivity) obj2;
                cvw.l(detectedActivity);
                cvw.l(detectedActivity2);
                int compareTo2 = Integer.valueOf(detectedActivity2.getConfidence()).compareTo(Integer.valueOf(detectedActivity.getConfidence()));
                return compareTo2 == 0 ? Integer.valueOf(detectedActivity.getType()).compareTo(Integer.valueOf(detectedActivity2.getType())) : compareTo2;
            default:
                return Long.compare(((Long) obj).longValue(), ((Long) obj2).longValue());
        }
    }
}
