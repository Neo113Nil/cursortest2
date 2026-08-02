package com.squareup.cash.initialscreenloader.backend;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.util.money.Moneys$$ExternalSyntheticLambda0;
import com.squareup.preferences.SharedPreferencesKeyValue;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes.dex */
public final class RealSquareStaffSwitchAccountContextStore {
    public final Moneys$$ExternalSyntheticLambda0 clock;
    public final SharedPreferencesKeyValue expiresAtPref;
    public final SharedPreferencesKeyValue invitationTokenPref;

    public RealSquareStaffSwitchAccountContextStore(SharedPreferencesKeyValue sharedPreferencesKeyValue, SharedPreferencesKeyValue sharedPreferencesKeyValue2, Moneys$$ExternalSyntheticLambda0 moneys$$ExternalSyntheticLambda0) {
        this.invitationTokenPref = sharedPreferencesKeyValue;
        this.expiresAtPref = sharedPreferencesKeyValue2;
        this.clock = moneys$$ExternalSyntheticLambda0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x004b, code lost:
    
        if (r5.expiresAtPref.delete(r0) != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004d, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0040, code lost:
    
        if (r5.invitationTokenPref.delete(r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object clear(ContinuationImpl continuationImpl) {
        RealSquareStaffSwitchAccountContextStore$clear$1 realSquareStaffSwitchAccountContextStore$clear$1;
        int i;
        if (continuationImpl instanceof RealSquareStaffSwitchAccountContextStore$clear$1) {
            realSquareStaffSwitchAccountContextStore$clear$1 = (RealSquareStaffSwitchAccountContextStore$clear$1) continuationImpl;
            int i2 = realSquareStaffSwitchAccountContextStore$clear$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realSquareStaffSwitchAccountContextStore$clear$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realSquareStaffSwitchAccountContextStore$clear$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realSquareStaffSwitchAccountContextStore$clear$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    realSquareStaffSwitchAccountContextStore$clear$1.label = 1;
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                realSquareStaffSwitchAccountContextStore$clear$1.label = 2;
            }
        }
        realSquareStaffSwitchAccountContextStore$clear$1 = new RealSquareStaffSwitchAccountContextStore$clear$1(this, continuationImpl);
        Object obj2 = realSquareStaffSwitchAccountContextStore$clear$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realSquareStaffSwitchAccountContextStore$clear$1.label;
        if (i != 0) {
        }
        realSquareStaffSwitchAccountContextStore$clear$1.label = 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x004d, code lost:
    
        if (r9 == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object pendingInvitationToken(ContinuationImpl continuationImpl) {
        RealSquareStaffSwitchAccountContextStore$pendingInvitationToken$1 realSquareStaffSwitchAccountContextStore$pendingInvitationToken$1;
        Object obj;
        int i;
        Object obj2;
        String str;
        String str2;
        long j;
        if (continuationImpl instanceof RealSquareStaffSwitchAccountContextStore$pendingInvitationToken$1) {
            realSquareStaffSwitchAccountContextStore$pendingInvitationToken$1 = (RealSquareStaffSwitchAccountContextStore$pendingInvitationToken$1) continuationImpl;
            int i2 = realSquareStaffSwitchAccountContextStore$pendingInvitationToken$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realSquareStaffSwitchAccountContextStore$pendingInvitationToken$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj3 = realSquareStaffSwitchAccountContextStore$pendingInvitationToken$1.result;
                obj = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realSquareStaffSwitchAccountContextStore$pendingInvitationToken$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj3);
                    realSquareStaffSwitchAccountContextStore$pendingInvitationToken$1.label = 1;
                    obj3 = this.invitationTokenPref.get(realSquareStaffSwitchAccountContextStore$pendingInvitationToken$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            j = realSquareStaffSwitchAccountContextStore$pendingInvitationToken$1.J$0;
                            str2 = realSquareStaffSwitchAccountContextStore$pendingInvitationToken$1.L$0;
                            SafeTrace.throwOnFailure(obj3);
                            if (str2 != null && ((Number) this.clock.invoke()).longValue() < j) {
                                return str2;
                            }
                            return null;
                        }
                        str = realSquareStaffSwitchAccountContextStore$pendingInvitationToken$1.L$0;
                        SafeTrace.throwOnFailure(obj3);
                        long longValue = ((Number) obj3).longValue();
                        realSquareStaffSwitchAccountContextStore$pendingInvitationToken$1.L$0 = str;
                        realSquareStaffSwitchAccountContextStore$pendingInvitationToken$1.J$0 = longValue;
                        realSquareStaffSwitchAccountContextStore$pendingInvitationToken$1.label = 3;
                        if (clear(realSquareStaffSwitchAccountContextStore$pendingInvitationToken$1) != obj) {
                            str2 = str;
                            j = longValue;
                            if (str2 != null) {
                                return str2;
                            }
                            return null;
                        }
                        return obj;
                    }
                    SafeTrace.throwOnFailure(obj3);
                }
                String str3 = (String) obj3;
                realSquareStaffSwitchAccountContextStore$pendingInvitationToken$1.L$0 = str3;
                realSquareStaffSwitchAccountContextStore$pendingInvitationToken$1.label = 2;
                obj2 = this.expiresAtPref.get(realSquareStaffSwitchAccountContextStore$pendingInvitationToken$1);
                if (obj2 != obj) {
                    str = str3;
                    obj3 = obj2;
                    long longValue2 = ((Number) obj3).longValue();
                    realSquareStaffSwitchAccountContextStore$pendingInvitationToken$1.L$0 = str;
                    realSquareStaffSwitchAccountContextStore$pendingInvitationToken$1.J$0 = longValue2;
                    realSquareStaffSwitchAccountContextStore$pendingInvitationToken$1.label = 3;
                    if (clear(realSquareStaffSwitchAccountContextStore$pendingInvitationToken$1) != obj) {
                    }
                }
                return obj;
            }
        }
        realSquareStaffSwitchAccountContextStore$pendingInvitationToken$1 = new RealSquareStaffSwitchAccountContextStore$pendingInvitationToken$1(this, continuationImpl);
        Object obj32 = realSquareStaffSwitchAccountContextStore$pendingInvitationToken$1.result;
        obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realSquareStaffSwitchAccountContextStore$pendingInvitationToken$1.label;
        if (i != 0) {
        }
        String str32 = (String) obj32;
        realSquareStaffSwitchAccountContextStore$pendingInvitationToken$1.L$0 = str32;
        realSquareStaffSwitchAccountContextStore$pendingInvitationToken$1.label = 2;
        obj2 = this.expiresAtPref.get(realSquareStaffSwitchAccountContextStore$pendingInvitationToken$1);
        if (obj2 != obj) {
        }
        return obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0060, code lost:
    
        if (r6.expiresAtPref.set(r2, r0) != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0062, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0040, code lost:
    
        if (r6.invitationTokenPref.set(r7, r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object save(String str, ContinuationImpl continuationImpl) {
        RealSquareStaffSwitchAccountContextStore$save$1 realSquareStaffSwitchAccountContextStore$save$1;
        int i;
        if (continuationImpl instanceof RealSquareStaffSwitchAccountContextStore$save$1) {
            realSquareStaffSwitchAccountContextStore$save$1 = (RealSquareStaffSwitchAccountContextStore$save$1) continuationImpl;
            int i2 = realSquareStaffSwitchAccountContextStore$save$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realSquareStaffSwitchAccountContextStore$save$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realSquareStaffSwitchAccountContextStore$save$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realSquareStaffSwitchAccountContextStore$save$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    realSquareStaffSwitchAccountContextStore$save$1.label = 1;
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                Long l = new Long(((Number) this.clock.invoke()).longValue() + 900000);
                realSquareStaffSwitchAccountContextStore$save$1.label = 2;
            }
        }
        realSquareStaffSwitchAccountContextStore$save$1 = new RealSquareStaffSwitchAccountContextStore$save$1(this, continuationImpl);
        Object obj2 = realSquareStaffSwitchAccountContextStore$save$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realSquareStaffSwitchAccountContextStore$save$1.label;
        if (i != 0) {
        }
        Long l2 = new Long(((Number) this.clock.invoke()).longValue() + 900000);
        realSquareStaffSwitchAccountContextStore$save$1.label = 2;
    }
}
