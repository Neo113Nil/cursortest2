package com.google.android.gms.internal.mlkit_common;

import androidx.lifecycle.LifecycleOwner;
import com.squareup.cash.core.views.ArcadeBottomNavigationKt$$ExternalSyntheticLambda3;
import com.squareup.cash.earnings.applets.presenters.EarnerAppletTilePresenter$Factory$Impl;
import com.squareup.cash.earnings.applets.presenters.RealEarnerAppletAvailabilityState;
import com.squareup.cash.money.applets.viewmodels.Applet;
import com.squareup.cash.money.core.ids.AppletId;
import com.stripe.android.core.model.parsers.ModelJsonParser;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.model.parsers.NextActionDataParser$WhenMappings;
import com.stripe.android.model.parsers.SetupIntentJsonParser;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.Iterator;
import net.idrnd.face.iad.capture.Plane;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public abstract class zzs implements ModelJsonParser {
    public static Applet earnerApplet(RealEarnerAppletAvailabilityState realEarnerAppletAvailabilityState, EarnerAppletTilePresenter$Factory$Impl earnerAppletTilePresenter$Factory$Impl, LifecycleOwner lifecycleOwner) {
        return new Applet(AppletId.EARNER, realEarnerAppletAvailabilityState.availabilityState, new ArcadeBottomNavigationKt$$ExternalSyntheticLambda3(18, earnerAppletTilePresenter$Factory$Impl, lifecycleOwner));
    }

    public static StripeIntent.NextActionData parse(JSONObject jSONObject) {
        Object obj;
        SetupIntentJsonParser setupIntentJsonParser;
        Plane plane = StripeIntent.NextActionType.Companion;
        String optString = jSONObject.optString("type");
        plane.getClass();
        Iterator it = StripeIntent.NextActionType.$ENTRIES.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((StripeIntent.NextActionType) obj).code.equals(optString)) {
                break;
            }
        }
        StripeIntent.NextActionType nextActionType = (StripeIntent.NextActionType) obj;
        switch (nextActionType == null ? -1 : NextActionDataParser$WhenMappings.$EnumSwitchMapping$0[nextActionType.ordinal()]) {
            case -1:
                return null;
            case 0:
            default:
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            case 1:
                setupIntentJsonParser = new SetupIntentJsonParser(12);
                break;
            case 2:
                setupIntentJsonParser = new SetupIntentJsonParser(9);
                break;
            case 3:
                setupIntentJsonParser = new SetupIntentJsonParser(10);
                break;
            case 4:
                setupIntentJsonParser = new SetupIntentJsonParser(11);
                break;
            case 5:
                setupIntentJsonParser = new SetupIntentJsonParser(13);
                break;
            case 6:
                setupIntentJsonParser = new SetupIntentJsonParser(14);
                break;
            case 7:
                setupIntentJsonParser = new SetupIntentJsonParser(15);
                break;
            case 8:
                setupIntentJsonParser = new SetupIntentJsonParser(16);
                break;
            case 9:
                setupIntentJsonParser = new SetupIntentJsonParser(6);
                break;
            case 10:
                setupIntentJsonParser = new SetupIntentJsonParser(7);
                break;
            case 11:
                setupIntentJsonParser = new SetupIntentJsonParser(19);
                break;
            case 12:
                setupIntentJsonParser = new SetupIntentJsonParser(18);
                break;
            case 13:
                setupIntentJsonParser = new SetupIntentJsonParser(8);
                break;
            case 14:
                setupIntentJsonParser = new SetupIntentJsonParser(17);
                break;
        }
        JSONObject optJSONObject = jSONObject.optJSONObject(nextActionType.code);
        if (optJSONObject == null) {
            optJSONObject = new JSONObject();
        }
        return (StripeIntent.NextActionData) setupIntentJsonParser.mo4026parse(optJSONObject);
    }

    public static boolean zza(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }
}
