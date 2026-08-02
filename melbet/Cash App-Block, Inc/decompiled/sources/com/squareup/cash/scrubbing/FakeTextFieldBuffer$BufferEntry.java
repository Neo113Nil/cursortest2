package com.squareup.cash.scrubbing;

/* loaded from: classes7.dex */
public interface FakeTextFieldBuffer$BufferEntry {

    public final class Inserted implements FakeTextFieldBuffer$BufferEntry {

        /* renamed from: char, reason: not valid java name */
        public final char f654char;

        public final boolean equals(Object obj) {
            if (obj instanceof Inserted) {
                return this.f654char == ((Inserted) obj).f654char;
            }
            return false;
        }

        @Override // com.squareup.cash.scrubbing.FakeTextFieldBuffer$BufferEntry
        public final char getChar() {
            return this.f654char;
        }

        public final int hashCode() {
            return Character.hashCode(this.f654char);
        }

        public final String toString() {
            return "Inserted(char=" + this.f654char + ")";
        }
    }

    public final class Original implements FakeTextFieldBuffer$BufferEntry {

        /* renamed from: char, reason: not valid java name */
        public final char f655char;
        public final int originalOffset;

        public Original(int i, char c) {
            this.originalOffset = i;
            this.f655char = c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Original)) {
                return false;
            }
            Original original = (Original) obj;
            return this.originalOffset == original.originalOffset && this.f655char == original.f655char;
        }

        @Override // com.squareup.cash.scrubbing.FakeTextFieldBuffer$BufferEntry
        public final char getChar() {
            return this.f655char;
        }

        public final int hashCode() {
            return Character.hashCode(this.f655char) + (Integer.hashCode(this.originalOffset) * 31);
        }

        public final String toString() {
            return "Original(originalOffset=" + this.originalOffset + ", char=" + this.f655char + ")";
        }
    }

    char getChar();
}
