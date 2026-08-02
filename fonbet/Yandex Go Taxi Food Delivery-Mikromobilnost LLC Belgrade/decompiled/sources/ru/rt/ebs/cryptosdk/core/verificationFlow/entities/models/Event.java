package ru.rt.ebs.cryptosdk.core.verificationFlow.entities.models;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lru/rt/ebs/cryptosdk/core/verificationFlow/entities/models/Event;", "", "<init>", "()V", "Start", "Process", "Finish", "Cancel", "Error", "Lru/rt/ebs/cryptosdk/core/verificationFlow/entities/models/Event$Cancel;", "Lru/rt/ebs/cryptosdk/core/verificationFlow/entities/models/Event$Error;", "Lru/rt/ebs/cryptosdk/core/verificationFlow/entities/models/Event$Finish;", "Lru/rt/ebs/cryptosdk/core/verificationFlow/entities/models/Event$Process;", "Lru/rt/ebs/cryptosdk/core/verificationFlow/entities/models/Event$Start;", "cryptosdk-core_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class Event {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0015\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lru/rt/ebs/cryptosdk/core/verificationFlow/entities/models/Event$Error;", "Lru/rt/ebs/cryptosdk/core/verificationFlow/entities/models/Event;", "value", "Ljava/lang/Exception;", "Lkotlin/Exception;", "<init>", "(Ljava/lang/Exception;)V", "getValue", "()Ljava/lang/Exception;", "cryptosdk-core_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Error extends Event {
        private final Exception value;

        public Error(Exception exc) {
            super(null);
            this.value = exc;
        }

        public final Exception getValue() {
            return this.value;
        }
    }

    public /* synthetic */ Event(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private Event() {
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/rt/ebs/cryptosdk/core/verificationFlow/entities/models/Event$Cancel;", "Lru/rt/ebs/cryptosdk/core/verificationFlow/entities/models/Event;", "value", "", "<init>", "(Ljava/lang/Object;)V", "getValue", "()Ljava/lang/Object;", "cryptosdk-core_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Cancel extends Event {
        private final Object value;

        public /* synthetic */ Cancel(Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? EMPTY.INSTANCE : obj);
        }

        public final Object getValue() {
            return this.value;
        }

        public Cancel(Object obj) {
            super(null);
            this.value = obj;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Cancel() {
            this(r0, 1, r0);
            DefaultConstructorMarker defaultConstructorMarker = null;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/rt/ebs/cryptosdk/core/verificationFlow/entities/models/Event$Finish;", "Lru/rt/ebs/cryptosdk/core/verificationFlow/entities/models/Event;", "value", "", "<init>", "(Ljava/lang/Object;)V", "getValue", "()Ljava/lang/Object;", "cryptosdk-core_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Finish extends Event {
        private final Object value;

        public /* synthetic */ Finish(Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? EMPTY.INSTANCE : obj);
        }

        public final Object getValue() {
            return this.value;
        }

        public Finish(Object obj) {
            super(null);
            this.value = obj;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Finish() {
            this(r0, 1, r0);
            DefaultConstructorMarker defaultConstructorMarker = null;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/rt/ebs/cryptosdk/core/verificationFlow/entities/models/Event$Process;", "Lru/rt/ebs/cryptosdk/core/verificationFlow/entities/models/Event;", "value", "", "<init>", "(Ljava/lang/Object;)V", "getValue", "()Ljava/lang/Object;", "cryptosdk-core_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Process extends Event {
        private final Object value;

        public /* synthetic */ Process(Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? EMPTY.INSTANCE : obj);
        }

        public final Object getValue() {
            return this.value;
        }

        public Process(Object obj) {
            super(null);
            this.value = obj;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Process() {
            this(r0, 1, r0);
            DefaultConstructorMarker defaultConstructorMarker = null;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/rt/ebs/cryptosdk/core/verificationFlow/entities/models/Event$Start;", "Lru/rt/ebs/cryptosdk/core/verificationFlow/entities/models/Event;", "value", "", "<init>", "(Ljava/lang/Object;)V", "getValue", "()Ljava/lang/Object;", "cryptosdk-core_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Start extends Event {
        private final Object value;

        public /* synthetic */ Start(Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? EMPTY.INSTANCE : obj);
        }

        public final Object getValue() {
            return this.value;
        }

        public Start(Object obj) {
            super(null);
            this.value = obj;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Start() {
            this(r0, 1, r0);
            DefaultConstructorMarker defaultConstructorMarker = null;
        }
    }
}
