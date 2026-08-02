package com.fillr.home.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.AsyncListDiffer;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.fillr.n;
import com.google.android.gms.maps.zzai;
import com.squareup.cash.R;
import com.squareup.cash.wallet.views.CardAppletTile$$ExternalSyntheticLambda1;
import com.withpersona.sdk2.inquiry.selfie.Selfie;
import com.withpersona.sdk2.inquiry.selfie.SelfieReviewCapturesRunner$SelfieImageAdapter$SelfieItem;
import com.withpersona.sdk2.inquiry.selfie.SelfieReviewCapturesRunner$SelfieImageAdapter$adapterHelper$2$1;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow;
import com.withpersona.sdk2.inquiry.selfie.databinding.Pi2SelfieReviewItemBinding;
import com.withpersona.sdk2.inquiry.shared.AdapterHelper$$ExternalSyntheticLambda0;
import com.withpersona.sdk2.inquiry.shared.AdapterHelper$ItemInfo;
import com.withpersona.sdk2.inquiry.shared.ViewBindingViewHolder;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import net.oneformapp.schema.Element;
import operations.logic.equals.Equals$$ExternalSyntheticLambda0;

/* loaded from: classes9.dex */
public final class FProfileHomeListViewAdapter extends RecyclerView.Adapter {
    public final /* synthetic */ int $r8$classId;
    public List elements;
    public Object inflater;
    public Object mContext;
    public Object onItemclickedListener;

    public FProfileHomeListViewAdapter(int i) {
        this.$r8$classId = i;
        switch (i) {
            case 1:
                this.elements = EmptyList.INSTANCE;
                zzai zzaiVar = new zzai(new Equals$$ExternalSyntheticLambda0(15));
                ReflectionFactory reflectionFactory = Reflection.factory;
                zzaiVar.addItemTypeInternal(reflectionFactory.getOrCreateKotlinClass(SelfieReviewCapturesRunner$SelfieImageAdapter$SelfieItem.class), reflectionFactory.getOrCreateKotlinClass(Pi2SelfieReviewItemBinding.class), SelfieReviewCapturesRunner$SelfieImageAdapter$adapterHelper$2$1.INSTANCE, new CardAppletTile$$ExternalSyntheticLambda1(this, 25));
                this.onItemclickedListener = zzaiVar;
                break;
        }
    }

    public Element getElement(int i) {
        return (Element) ((ArrayList) this.elements).get(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        switch (this.$r8$classId) {
            case 0:
                return ((ArrayList) this.elements).size();
            default:
                return ((AsyncListDiffer) ((zzai) this.onItemclickedListener).zza).mReadOnlyList.size();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        switch (this.$r8$classId) {
            case 0:
                return getElement(i).actingElement().pathKey.hashCode();
            default:
                return super.getItemId(i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        switch (this.$r8$classId) {
            case 0:
                return 1;
            default:
                return ((zzai) this.onItemclickedListener).getItemInfoFromPosition(i).viewType;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        switch (this.$r8$classId) {
            case 0:
                if (viewHolder instanceof BaseProfileHomeListViewAdapter$ProfileHomeViewHolder) {
                    BaseProfileHomeListViewAdapter$ProfileHomeViewHolder baseProfileHomeListViewAdapter$ProfileHomeViewHolder = (BaseProfileHomeListViewAdapter$ProfileHomeViewHolder) viewHolder;
                    ArrayList arrayList = (ArrayList) this.elements;
                    if (arrayList != null && arrayList.size() > 0) {
                        Element element = getElement(i);
                        baseProfileHomeListViewAdapter$ProfileHomeViewHolder.txtViewTitle.setText(element.getDisplayName());
                        String str = element.actingElement().pathKey;
                        break;
                    }
                }
                break;
            default:
                viewHolder.getClass();
                zzai zzaiVar = (zzai) this.onItemclickedListener;
                zzaiVar.getClass();
                AdapterHelper$ItemInfo itemInfoFromPosition = zzaiVar.getItemInfoFromPosition(i);
                ViewBinding viewBinding = ((ViewBindingViewHolder) viewHolder).binding;
                AdapterHelper$$ExternalSyntheticLambda0 adapterHelper$$ExternalSyntheticLambda0 = itemInfoFromPosition.bindViewHolder;
                List list = ((AsyncListDiffer) zzaiVar.zza).mReadOnlyList;
                list.getClass();
                adapterHelper$$ExternalSyntheticLambda0.invoke(list.get(i), viewBinding, viewHolder);
                break;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        switch (this.$r8$classId) {
            case 0:
                n.b bVar = (n.b) this.onItemclickedListener;
                LayoutInflater layoutInflater = (LayoutInflater) this.inflater;
                if (i == 0) {
                    return new BaseProfileHomeListViewAdapter$ProfileFeedbackViewHolder(layoutInflater.inflate(R.layout.com_fillr_feedbackcard, viewGroup, false), bVar, (FragmentActivity) this.mContext);
                }
                View inflate = layoutInflater.inflate(R.layout.f_row_profile, viewGroup, false);
                BaseProfileHomeListViewAdapter$ProfileHomeViewHolder baseProfileHomeListViewAdapter$ProfileHomeViewHolder = new BaseProfileHomeListViewAdapter$ProfileHomeViewHolder(inflate);
                baseProfileHomeListViewAdapter$ProfileHomeViewHolder.mListener = bVar;
                baseProfileHomeListViewAdapter$ProfileHomeViewHolder.txtViewTitle = (TextView) inflate.findViewById(R.id.txtField);
                ((ImageView) inflate.findViewById(R.id.f_img_icon)).setOnClickListener(baseProfileHomeListViewAdapter$ProfileHomeViewHolder);
                inflate.setOnClickListener(baseProfileHomeListViewAdapter$ProfileHomeViewHolder);
                return baseProfileHomeListViewAdapter$ProfileHomeViewHolder;
            default:
                viewGroup.getClass();
                return ((zzai) this.onItemclickedListener).onCreateViewHolder(viewGroup, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [com.withpersona.sdk2.inquiry.selfie.SelfieReviewCapturesRunner$SelfieImageAdapter$SelfieItem] */
    public void refreshItems() {
        ArrayList arrayList = new ArrayList();
        for (Selfie selfie : this.elements) {
            String str = null;
            if (selfie instanceof Selfie.SelfieImage) {
                Selfie.SelfieImage selfieImage = (Selfie.SelfieImage) selfie;
                int ordinal = selfieImage.pose.ordinal();
                if (ordinal == 0) {
                    SelfieWorkflow.Screen.ReviewCapturesScreen.Strings strings = (SelfieWorkflow.Screen.ReviewCapturesScreen.Strings) this.mContext;
                    if (strings != null) {
                        str = strings.selfieLabelFront;
                    }
                } else if (ordinal == 1) {
                    SelfieWorkflow.Screen.ReviewCapturesScreen.Strings strings2 = (SelfieWorkflow.Screen.ReviewCapturesScreen.Strings) this.mContext;
                    if (strings2 != null) {
                        str = strings2.selfieLabelLeft;
                    }
                } else if (ordinal != 2) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                } else {
                    SelfieWorkflow.Screen.ReviewCapturesScreen.Strings strings3 = (SelfieWorkflow.Screen.ReviewCapturesScreen.Strings) this.mContext;
                    if (strings3 != null) {
                        str = strings3.selfieLabelRight;
                    }
                }
                str = new SelfieReviewCapturesRunner$SelfieImageAdapter$SelfieItem(str, selfieImage);
            } else if (!(selfie instanceof Selfie.SelfieVideo)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return;
            }
            if (str != null) {
                arrayList.add(str);
            }
        }
        zzai.setItems$default((zzai) this.onItemclickedListener, arrayList, this);
    }
}
