package com.bugsnag.android;

import android.content.Context;
import android.content.SharedPreferences;
import com.bugsnag.android.DeviceIdStore;
import com.bugsnag.android.StateEvent;
import com.bugsnag.android.User;
import com.bugsnag.android.internal.ImmutableConfig;
import com.bugsnag.android.internal.StateObserver;
import com.bugsnag.android.internal.dag.Provider;
import com.bugsnag.android.internal.dag.RunnableProvider;
import com.squareup.cash.storage.RealStorage$temp$1;
import java.io.File;

/* loaded from: classes.dex */
public final class StorageModule$special$$inlined$provider$3 extends RunnableProvider {
    public final /* synthetic */ Object $appContext$inlined;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ StorageModule this$0;

    public /* synthetic */ StorageModule$special$$inlined$provider$3(StorageModule storageModule, Object obj, int i) {
        this.$r8$classId = i;
        this.this$0 = storageModule;
        this.$appContext$inlined = obj;
    }

    @Override // com.bugsnag.android.internal.dag.RunnableProvider
    public final Object invoke() {
        UserState userState;
        SharedPreferences sharedPreferences;
        SharedPreferences.Editor edit;
        SharedPreferences.Editor clear;
        User user;
        int i = this.$r8$classId;
        Object obj = this.$appContext$inlined;
        StorageModule storageModule = this.this$0;
        switch (i) {
            case 0:
                StorageModule$special$$inlined$provider$2 storageModule$special$$inlined$provider$2 = (StorageModule$special$$inlined$provider$2) storageModule.sharedPrefMigrator;
                ImmutableConfig immutableConfig = storageModule.immutableConfig;
                return new DeviceIdStore((Context) obj, storageModule$special$$inlined$provider$2, immutableConfig, immutableConfig.logger);
            default:
                final UserStore userStore = (UserStore) ((StorageModule$special$$inlined$provider$1) storageModule.userStore).get();
                User user2 = (User) obj;
                Provider provider = userStore.deviceIdStore;
                boolean z = userStore.persist;
                if (user2.id == null && user2.name == null && user2.email == null) {
                    if (z) {
                        DeliveryParams deliveryParams = userStore.synchronizedStreamableStore;
                        Provider provider2 = userStore.sharedPrefMigrator;
                        SharedPreferences sharedPreferences2 = ((SharedPrefMigrator) provider2.get()).prefs;
                        if (sharedPreferences2 != null && sharedPreferences2.contains("install.iud")) {
                            SharedPrefMigrator sharedPrefMigrator = (SharedPrefMigrator) provider2.get();
                            DeviceIdStore.DeviceIds deviceIds = (DeviceIdStore.DeviceIds) provider.get();
                            String str = deviceIds != null ? deviceIds.deviceId : null;
                            SharedPreferences sharedPreferences3 = sharedPrefMigrator.prefs;
                            User user3 = new User(sharedPreferences3 != null ? sharedPreferences3.getString("user.id", str) : null, sharedPreferences3 != null ? sharedPreferences3.getString("user.email", null) : null, sharedPreferences3 != null ? sharedPreferences3.getString("user.name", null) : null);
                            userStore.save(user3);
                            user2 = user3;
                        } else if (((File) deliveryParams.endpoint).canRead() && ((File) deliveryParams.endpoint).length() > 0 && z) {
                            try {
                                user = (User) deliveryParams.load(new RealStorage$temp$1(1, User.Companion, User.Companion.class, "fromReader", "fromReader(Landroid/util/JsonReader;)Lcom/bugsnag/android/User;", 0, 7));
                            } catch (Exception e) {
                                userStore.logger.w("Failed to load user info", e);
                                user = null;
                            }
                            user2 = user;
                        }
                    }
                    user2 = null;
                }
                if (user2 == null || (user2.id == null && user2.name == null && user2.email == null)) {
                    DeviceIdStore.DeviceIds deviceIds2 = (DeviceIdStore.DeviceIds) provider.get();
                    userState = new UserState(new User(deviceIds2 != null ? deviceIds2.deviceId : null, null, null));
                } else {
                    userState = new UserState(user2);
                }
                userState.addObserver(new StateObserver() { // from class: com.bugsnag.android.UserStore$$ExternalSyntheticLambda0
                    @Override // com.bugsnag.android.internal.StateObserver
                    public final void onStateChange(StateEvent stateEvent) {
                        if (stateEvent instanceof StateEvent.UpdateUser) {
                            UserStore.this.save(((StateEvent.UpdateUser) stateEvent).user);
                        }
                    }
                });
                SharedPrefMigrator sharedPrefMigrator2 = (SharedPrefMigrator) ((StorageModule$special$$inlined$provider$2) storageModule.sharedPrefMigrator).getOrNull();
                if (sharedPrefMigrator2 != null && (sharedPreferences = sharedPrefMigrator2.prefs) != null && sharedPreferences.contains("install.iud") && sharedPreferences != null && (edit = sharedPreferences.edit()) != null && (clear = edit.clear()) != null) {
                    clear.commit();
                }
                return userState;
        }
    }
}
