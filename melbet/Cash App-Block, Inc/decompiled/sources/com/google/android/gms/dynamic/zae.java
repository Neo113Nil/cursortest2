package com.google.android.gms.dynamic;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.os.CancellationSignal;
import com.fillr.profile.adapter.ProfileAdapter;
import com.google.android.gms.internal.time.zzbq;
import com.squareup.cash.R;
import com.squareup.cash.support.chat.views.transcript.message.MessageBodyLayout;
import java.util.List;
import net.oneformapp.schema.Element;

/* loaded from: classes4.dex */
public final class zae implements View.OnClickListener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object zaa;
    public final /* synthetic */ Object zab;

    public /* synthetic */ zae(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.zab = obj;
        this.zaa = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.$r8$classId;
        Object obj = this.zab;
        Object obj2 = this.zaa;
        switch (i) {
            case 0:
                try {
                    ((Context) obj2).startActivity((Intent) obj);
                    break;
                } catch (ActivityNotFoundException e) {
                    Log.e("DeferredLifecycleHelper", "Failed to start resolution intent", e);
                    return;
                }
            case 1:
                CancellationSignal cancellationSignal = (CancellationSignal) ((zzbq) obj).zza;
                boolean z = cancellationSignal.mCancelInProgress;
                cancellationSignal.mCancelInProgress = !z;
                ImageView imageView = (ImageView) obj2;
                if (!z) {
                    imageView.setImageResource(R.drawable.icon_fillr_checkbox_on);
                    break;
                } else {
                    imageView.setImageResource(R.drawable.icon_fillr_checkbox_off);
                    break;
                }
            case 2:
                int intValue = ((Integer) view.getTag()).intValue();
                ProfileAdapter profileAdapter = (ProfileAdapter) obj;
                List list = profileAdapter.groupElements;
                Toolbar.AnonymousClass1 anonymousClass1 = profileAdapter.profileManager;
                Element element = (Element) list.get(intValue);
                if (element == null && element.actingElement().isArrayType && element.getChildrenCount() == 1) {
                    element = element.getFirstChildElement();
                }
                anonymousClass1.addNamespaceToProfile(element, true);
                profileAdapter.mHostingFragment.refreshData();
                if (((Element) obj2).isAddress()) {
                    Element childElementAt = element.getChildElementAt(0);
                    childElementAt.alterPathForArrays(anonymousClass1.getProfileElementCount(element.actingElement().pathKey) - 1);
                    profileAdapter.showAddressAutocompletionDialog(childElementAt);
                    break;
                }
                break;
            default:
                ((MessageBodyLayout) obj2).onImageClick.invoke((String) obj);
                break;
        }
    }

    public /* synthetic */ zae(Object obj, Object obj2, boolean z, int i) {
        this.$r8$classId = i;
        this.zaa = obj;
        this.zab = obj2;
    }
}
