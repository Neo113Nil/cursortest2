package com.miteksystems.misnap.workflow.util;

import android.text.Html;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.gms.internal.mlkit_common.zzsr;
import com.google.android.gms.internal.mlkit_vision_common.zzjk;
import com.google.android.gms.internal.mlkit_vision_text_common.zztq;
import com.google.android.gms.internal.mlkit_vision_text_common.zzuc;
import com.google.android.material.textview.MaterialTextView;
import com.squareup.protos.cash.marketdata.model.InvestmentEarnings$Earning$UpcomingEps$ActualEps;
import com.squareup.protos.common.Money;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.LogRecord;

/* loaded from: classes4.dex */
public abstract class TextUtil {
    public static zzsr zza;

    public static final Money access$getActual_eps(zzjk zzjkVar) {
        InvestmentEarnings$Earning$UpcomingEps$ActualEps investmentEarnings$Earning$UpcomingEps$ActualEps = zzjkVar instanceof InvestmentEarnings$Earning$UpcomingEps$ActualEps ? (InvestmentEarnings$Earning$UpcomingEps$ActualEps) zzjkVar : null;
        if (investmentEarnings$Earning$UpcomingEps$ActualEps != null) {
            return investmentEarnings$Earning$UpcomingEps$ActualEps.value;
        }
        return null;
    }

    public static final int access$getAndroidLevel(LogRecord logRecord) {
        int intValue = logRecord.getLevel().intValue();
        Level level = Level.INFO;
        if (intValue > level.intValue()) {
            return 5;
        }
        return logRecord.getLevel().intValue() == level.intValue() ? 4 : 3;
    }

    public static /* synthetic */ ArrayList getTextViews$workflow_release(View view) {
        view.getClass();
        ArrayList arrayList = new ArrayList();
        if (view instanceof TextView) {
            arrayList.add(view);
            return arrayList;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                childAt.getClass();
                arrayList.addAll(getTextViews$workflow_release(childAt));
            }
        }
        return arrayList;
    }

    public static final void setHtmlText(MaterialTextView materialTextView, String str) {
        str.getClass();
        materialTextView.setText(Html.fromHtml(str, 0));
    }

    public static synchronized zzuc zzb(String str) {
        zzuc zzucVar;
        synchronized (TextUtil.class) {
            zztq zztqVar = new zztq(str);
            synchronized (TextUtil.class) {
                try {
                    if (zza == null) {
                        zza = new zzsr(5);
                    }
                    zzucVar = (zzuc) zza.get(zztqVar);
                } catch (Throwable th) {
                    throw th;
                }
            }
            return zzucVar;
        }
        return zzucVar;
    }
}
