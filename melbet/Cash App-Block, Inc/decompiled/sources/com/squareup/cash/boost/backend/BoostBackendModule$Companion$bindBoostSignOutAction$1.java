package com.squareup.cash.boost.backend;

import android.content.SharedPreferences;
import app.cash.local.db.LocalTabContentQueries;
import app.cash.molecule.MoleculeKt$$ExternalSyntheticLambda1;
import app.cash.sqldelight.driver.android.AndroidSqliteDriver;
import com.squareup.cash.biometrics.AndroidSecureStore;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticLambda10;
import com.squareup.cash.data.contacts.ContactSync$ResetReason;
import com.squareup.cash.data.contacts.RealContactSync;
import com.squareup.cash.data.profile.RealReferralManager;
import com.squareup.cash.db2.Instrument$Adapter;
import com.squareup.cash.db2.security.PasswordInfoQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.gps.db.GpsConfigQueries;
import com.squareup.cash.session.backend.OnSignOutAction;
import com.squareup.cash.session.backend.RealOnSessionChangeActionsExecutor$executeSignOut$1;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.cash.storage.FileDownloader$Category;
import com.squareup.cash.storage.RealFileDownloader;
import com.squareup.cash.storage.StorageLink;
import com.squareup.cash.support.backend.real.RealSupportViewedArticlesStore;
import com.squareup.preferences.BooleanPreference;
import com.squareup.preferences.KeyValue;
import java.io.IOException;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Intrinsics;
import okio.FileSystem;
import okio.Path;
import timber.log.Timber;

/* loaded from: classes.dex */
public final class BoostBackendModule$Companion$bindBoostSignOutAction$1 implements OnSignOutAction {
    public final /* synthetic */ Object $boostConfigManager;
    public final /* synthetic */ Object $boostSyncer;
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ BoostBackendModule$Companion$bindBoostSignOutAction$1(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.$boostSyncer = obj;
        this.$boostConfigManager = obj2;
    }

    @Override // com.squareup.cash.session.backend.OnSignOutAction
    public final Object clearData(SessionManager.DeletionMode deletionMode, RealOnSessionChangeActionsExecutor$executeSignOut$1 realOnSessionChangeActionsExecutor$executeSignOut$1) {
        Throwable th;
        Unit unit;
        int i = this.$r8$classId;
        Object obj = null;
        Object obj2 = this.$boostConfigManager;
        Object obj3 = this.$boostSyncer;
        switch (i) {
            case 0:
                RealBoostSyncer realBoostSyncer = (RealBoostSyncer) ((BoostSyncer) obj3);
                realBoostSyncer.lastUpdated = 0L;
                LocalTabContentQueries localTabContentQueries = realBoostSyncer.userRewardsDataQueries;
                AndroidSqliteDriver.Transaction transaction = (AndroidSqliteDriver.Transaction) localTabContentQueries.driver.newTransaction().getValue();
                transaction.getClass();
                AndroidSqliteDriver.Transaction transaction2 = transaction.enclosingTransaction;
                int i2 = 1;
                try {
                    realBoostSyncer.nonatomicResetRewards(null, true);
                    unit = Unit.INSTANCE;
                    try {
                        transaction.successful = true;
                        transaction.endTransaction$runtime();
                        localTabContentQueries.postTransactionCleanup(transaction, transaction2, null, unit);
                    } catch (Throwable th2) {
                        th = th2;
                        transaction.endTransaction$runtime();
                        localTabContentQueries.postTransactionCleanup(transaction, transaction2, th, unit);
                        RealBoostConfigManager realBoostConfigManager = (RealBoostConfigManager) ((BoostConfigManager) obj2);
                        realBoostConfigManager.lastUpdated = 0L;
                        LocalTabContentQueries localTabContentQueries2 = realBoostConfigManager.boostConfigQueries;
                        localTabContentQueries2.driver.execute(1352430653, "UPDATE boostConfig\nSET expirationHintThresholdBps = ?,\n    bitcoinBoostUpsell = ?", new MoleculeKt$$ExternalSyntheticLambda1(4, obj, obj, localTabContentQueries2));
                        localTabContentQueries2.notifyQueries(1352430653, new Matcher$$ExternalSyntheticLambda10(i2));
                        return Unit.INSTANCE;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    unit = null;
                }
                RealBoostConfigManager realBoostConfigManager2 = (RealBoostConfigManager) ((BoostConfigManager) obj2);
                realBoostConfigManager2.lastUpdated = 0L;
                LocalTabContentQueries localTabContentQueries22 = realBoostConfigManager2.boostConfigQueries;
                localTabContentQueries22.driver.execute(1352430653, "UPDATE boostConfig\nSET expirationHintThresholdBps = ?,\n    bitcoinBoostUpsell = ?", new MoleculeKt$$ExternalSyntheticLambda1(4, obj, obj, localTabContentQueries22));
                localTabContentQueries22.notifyQueries(1352430653, new Matcher$$ExternalSyntheticLambda10(i2));
            case 1:
                if (!(((StorageLink) obj3) instanceof StorageLink.Legacy) || (r7 = ((KeyValue) obj2).delete(realOnSessionChangeActionsExecutor$executeSignOut$1)) != CoroutineSingletons.COROUTINE_SUSPENDED) {
                }
                break;
            case 2:
                if (((StorageLink) obj3) instanceof StorageLink.Legacy) {
                    ((SharedPreferences) ((AndroidSecureStore) obj2).storage.delegate).edit().clear().apply();
                }
                break;
            case 3:
                if (!(((StorageLink) obj3) instanceof StorageLink.Legacy) || (r7 = ((RealContactSync) obj2).reset(ContactSync$ResetReason.SignOut.INSTANCE, realOnSessionChangeActionsExecutor$executeSignOut$1)) != CoroutineSingletons.COROUTINE_SUSPENDED) {
                }
                break;
            case 4:
                if (((StorageLink) obj3) instanceof StorageLink.Legacy) {
                    RealReferralManager realReferralManager = (RealReferralManager) obj2;
                    BooleanPreference booleanPreference = realReferralManager.shouldCallGetRewardStatus;
                    booleanPreference.preferences.edit().remove(booleanPreference.key).apply();
                    GpsConfigQueries gpsConfigQueries = realReferralManager.queries;
                    gpsConfigQueries.driver.execute(52273239, "DELETE FROM rewardStatus", null);
                    gpsConfigQueries.notifyQueries(52273239, new PasswordInfoQueries$$ExternalSyntheticLambda0(7));
                }
                break;
            case 5:
                if (((StorageLink) obj3) instanceof StorageLink.Legacy) {
                    FileDownloader$Category fileDownloader$Category = FileDownloader$Category.DOCUMENTS;
                    EmptyList.INSTANCE.getClass();
                    FileSystem fileSystem = ((RealFileDownloader) obj2).fileSystem;
                    String str = Path.DIRECTORY_SEPARATOR;
                    List<Path> listOrNull = fileSystem.listOrNull(Path.Companion.get(fileDownloader$Category.getFolderName(), false));
                    if (listOrNull != null) {
                        for (Path path : listOrNull) {
                            String str2 = Path.DIRECTORY_SEPARATOR;
                            if (!Intrinsics.areEqual(path, Path.Companion.get(fileDownloader$Category.getFolderName(), false).resolve("tmp"))) {
                                path.name();
                                try {
                                    fileSystem.delete(path, false);
                                } catch (IOException e) {
                                    Timber.Forest.e("Failed to delete " + path, new Object[0], e);
                                }
                            }
                        }
                    }
                }
                break;
            case 6:
                if (!(((StorageLink) obj3) instanceof StorageLink.Legacy) || (r7 = ((Instrument$Adapter) obj2).reset(realOnSessionChangeActionsExecutor$executeSignOut$1)) != CoroutineSingletons.COROUTINE_SUSPENDED) {
                }
                break;
            default:
                if (!(((StorageLink) obj3) instanceof StorageLink.Legacy)) {
                    break;
                } else {
                    Object delete = ((RealSupportViewedArticlesStore) obj2).keyValue.delete(realOnSessionChangeActionsExecutor$executeSignOut$1);
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    if (delete != coroutineSingletons) {
                        delete = Unit.INSTANCE;
                    }
                    if (delete != coroutineSingletons) {
                        break;
                    }
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
