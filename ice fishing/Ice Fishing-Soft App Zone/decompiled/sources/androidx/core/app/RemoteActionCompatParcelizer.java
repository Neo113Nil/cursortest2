package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import com.google.android.datatransport.WinterFlowJavaConsumer;
import com.google.android.datatransport.WinterFlowServiceProviderLoader;
import com.google.android.datatransport.WinterFlowThreadPool;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(WinterFlowServiceProviderLoader winterFlowServiceProviderLoader) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        WinterFlowJavaConsumer winterFlowJavaConsumer = remoteActionCompat.WinterFlowRouterStructure;
        boolean z = true;
        if (winterFlowServiceProviderLoader.WinterFlowVariableVersionControl(1)) {
            winterFlowJavaConsumer = winterFlowServiceProviderLoader.WinterFlowUnitTestResponse();
        }
        remoteActionCompat.WinterFlowRouterStructure = (IconCompat) winterFlowJavaConsumer;
        CharSequence charSequence = remoteActionCompat.WinterFlowHookDataSource;
        if (winterFlowServiceProviderLoader.WinterFlowVariableVersionControl(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((WinterFlowThreadPool) winterFlowServiceProviderLoader).WinterFlowVariableVersionControl);
        }
        remoteActionCompat.WinterFlowHookDataSource = charSequence;
        CharSequence charSequence2 = remoteActionCompat.WinterFlowCacheManagerAgent;
        if (winterFlowServiceProviderLoader.WinterFlowVariableVersionControl(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((WinterFlowThreadPool) winterFlowServiceProviderLoader).WinterFlowVariableVersionControl);
        }
        remoteActionCompat.WinterFlowCacheManagerAgent = charSequence2;
        remoteActionCompat.WinterFlowArrayNetwork = (PendingIntent) winterFlowServiceProviderLoader.WinterFlowTransactionManagerStrategy(remoteActionCompat.WinterFlowArrayNetwork, 4);
        boolean z2 = remoteActionCompat.WinterFlowVariableVersionControl;
        if (winterFlowServiceProviderLoader.WinterFlowVariableVersionControl(5)) {
            z2 = ((WinterFlowThreadPool) winterFlowServiceProviderLoader).WinterFlowVariableVersionControl.readInt() != 0;
        }
        remoteActionCompat.WinterFlowVariableVersionControl = z2;
        boolean z3 = remoteActionCompat.WinterFlowTransactionManagerStrategy;
        if (!winterFlowServiceProviderLoader.WinterFlowVariableVersionControl(6)) {
            z = z3;
        } else if (((WinterFlowThreadPool) winterFlowServiceProviderLoader).WinterFlowVariableVersionControl.readInt() == 0) {
            z = false;
        }
        remoteActionCompat.WinterFlowTransactionManagerStrategy = z;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, WinterFlowServiceProviderLoader winterFlowServiceProviderLoader) {
        winterFlowServiceProviderLoader.getClass();
        IconCompat iconCompat = remoteActionCompat.WinterFlowRouterStructure;
        winterFlowServiceProviderLoader.WinterFlowRouterRouter(1);
        winterFlowServiceProviderLoader.WinterFlowSyntax(iconCompat);
        CharSequence charSequence = remoteActionCompat.WinterFlowHookDataSource;
        winterFlowServiceProviderLoader.WinterFlowRouterRouter(2);
        Parcel parcel = ((WinterFlowThreadPool) winterFlowServiceProviderLoader).WinterFlowVariableVersionControl;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.WinterFlowCacheManagerAgent;
        winterFlowServiceProviderLoader.WinterFlowRouterRouter(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        PendingIntent pendingIntent = remoteActionCompat.WinterFlowArrayNetwork;
        winterFlowServiceProviderLoader.WinterFlowRouterRouter(4);
        parcel.writeParcelable(pendingIntent, 0);
        boolean z = remoteActionCompat.WinterFlowVariableVersionControl;
        winterFlowServiceProviderLoader.WinterFlowRouterRouter(5);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = remoteActionCompat.WinterFlowTransactionManagerStrategy;
        winterFlowServiceProviderLoader.WinterFlowRouterRouter(6);
        parcel.writeInt(z2 ? 1 : 0);
    }
}
