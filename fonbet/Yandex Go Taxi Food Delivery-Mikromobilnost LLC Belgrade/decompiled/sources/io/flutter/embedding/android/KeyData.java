package io.flutter.embedding.android;

/* loaded from: classes4.dex */
public class KeyData {
    public long a;
    public Type b;
    public long c;
    public long d;
    public boolean e;
    public DeviceType f;
    public String g;

    public enum DeviceType {
        kKeyboard(0),
        kDirectionalPad(1),
        kGamepad(2),
        kJoystick(3),
        kHdmi(4);

        private final long value;

        DeviceType(long j) {
            this.value = j;
        }

        public final long a() {
            return this.value;
        }
    }

    public enum Type {
        kDown(0),
        kUp(1),
        kRepeat(2);

        private long value;

        Type(long j) {
            this.value = j;
        }

        public final long a() {
            return this.value;
        }
    }
}
