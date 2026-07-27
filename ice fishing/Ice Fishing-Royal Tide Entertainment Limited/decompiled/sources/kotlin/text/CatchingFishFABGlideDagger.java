package kotlin.text;

import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.util.Log;
import java.util.Objects;
import java.util.regex.Matcher;

/* loaded from: classes.dex */
public final class CatchingFishFABGlideDagger extends CatchingFishPayPalRedux {
    public final /* synthetic */ CatchingFishGlideAdMobMVI CatchingFishParcelableFAB;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CatchingFishFABGlideDagger(CatchingFishGlideAdMobMVI catchingFishGlideAdMobMVI, Looper looper) {
        super(looper);
        this.CatchingFishParcelableFAB = catchingFishGlideAdMobMVI;
        Looper.getMainLooper();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        CatchingFishGlideAdMobMVI catchingFishGlideAdMobMVI = this.CatchingFishParcelableFAB;
        if (message != null) {
            Object obj = message.obj;
            if (obj instanceof Intent) {
                Intent intent = (Intent) obj;
                intent.setExtrasClassLoader(new CatchingFishMockkKtorWidget());
                if (intent.hasExtra("google.messenger")) {
                    Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
                    if (parcelableExtra instanceof CatchingFishDaggerGraphQL) {
                        catchingFishGlideAdMobMVI.CatchingFishViewModelScope = (CatchingFishDaggerGraphQL) parcelableExtra;
                    }
                    if (parcelableExtra instanceof Messenger) {
                        catchingFishGlideAdMobMVI.CatchingFishWorkManager = (Messenger) parcelableExtra;
                    }
                }
                Intent intent2 = (Intent) message.obj;
                String action = intent2.getAction();
                if (!Objects.equals(action, "com.google.android.c2dm.intent.REGISTRATION")) {
                    if (Log.isLoggable("Rpc", 3)) {
                        "Unexpected response action: ".concat(String.valueOf(action));
                        return;
                    }
                    return;
                }
                String stringExtra = intent2.getStringExtra("registration_id");
                if (stringExtra == null) {
                    stringExtra = intent2.getStringExtra("unregistered");
                }
                if (stringExtra != null) {
                    Matcher matcher = CatchingFishGlideAdMobMVI.CatchingFishFragmentHandler.matcher(stringExtra);
                    if (!matcher.matches()) {
                        if (Log.isLoggable("Rpc", 3)) {
                            "Unexpected response string: ".concat(stringExtra);
                            return;
                        }
                        return;
                    }
                    String group = matcher.group(1);
                    String group2 = matcher.group(2);
                    if (group != null) {
                        Bundle extras = intent2.getExtras();
                        extras.putString("registration_id", group2);
                        catchingFishGlideAdMobMVI.CatchingFishSnackbar(group, extras);
                        return;
                    }
                    return;
                }
                String stringExtra2 = intent2.getStringExtra("error");
                if (stringExtra2 == null) {
                    "Unexpected response, no error or registration id ".concat(String.valueOf(intent2.getExtras()));
                    return;
                }
                if (Log.isLoggable("Rpc", 3)) {
                    "Received InstanceID error ".concat(stringExtra2);
                }
                if (!stringExtra2.startsWith("|")) {
                    synchronized (catchingFishGlideAdMobMVI.CatchingFishParcelableFAB) {
                        int i = 0;
                        while (true) {
                            try {
                                CatchingFishGraphQLRealmFAB catchingFishGraphQLRealmFAB = catchingFishGlideAdMobMVI.CatchingFishParcelableFAB;
                                if (i < catchingFishGraphQLRealmFAB.CatchingFishWorkManager) {
                                    catchingFishGlideAdMobMVI.CatchingFishSnackbar((String) catchingFishGraphQLRealmFAB.CatchingFishWorkManager(i), intent2.getExtras());
                                    i++;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    return;
                }
                String[] split = stringExtra2.split("\\|");
                if (split.length <= 2 || !Objects.equals(split[1], "ID")) {
                    "Unexpected structured response ".concat(stringExtra2);
                    return;
                }
                String str = split[2];
                String str2 = split[3];
                if (str2.startsWith(":")) {
                    str2 = str2.substring(1);
                }
                catchingFishGlideAdMobMVI.CatchingFishSnackbar(str, intent2.putExtra("error", str2).getExtras());
            }
        }
    }
}
